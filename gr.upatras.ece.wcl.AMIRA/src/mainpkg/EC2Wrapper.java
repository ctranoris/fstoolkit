package mainpkg;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.AllocateAddressRequest;
import com.amazonaws.services.ec2.model.AllocateAddressResult;
import com.amazonaws.services.ec2.model.AssociateAddressRequest;
import com.amazonaws.services.ec2.model.CreateKeyPairRequest;
import com.amazonaws.services.ec2.model.CreateKeyPairResult;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.DescribeKeyPairsRequest;
import com.amazonaws.services.ec2.model.DescribeKeyPairsResult;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.KeyPair;
import com.amazonaws.services.ec2.model.KeyPairInfo;
import com.amazonaws.services.ec2.model.Placement;
import com.amazonaws.services.ec2.model.Reservation;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.amazonaws.services.ec2.model.TerminateInstancesRequest;
import com.amazonaws.services.ec2.model.TerminateInstancesResult;

public class EC2Wrapper {

    private AmazonEC2 ec2;
	private String ReservationId;
	private String instanceId;
	private AWSCredentials credentials;
	/**
	 * @return the reservationId
	 */
	public String getReservationId() {
		return ReservationId;
	}


	/**
	 * @return the instanceId
	 */
	public String getInstanceId() {
		return instanceId;
	}


	/**
	 * @return the keyPair
	 */
	public KeyPair getKeyPair() {
		return keyPair;
	}


	/**
	 * @return the publicIp
	 */
	public String getPublicIp() {
		return publicIp;
	}


	/**
	 * @return the publicDnsName
	 */
	public String getPublicDnsName() {
		return publicDnsName;
	}

	private KeyPair keyPair;
	private String publicIp;
	private String publicDnsName = "-";
	
	public EC2Wrapper(String accKey, String secKey)throws Exception {
		credentials = new BasicAWSCredentials(accKey, secKey);

		ec2 = new AmazonEC2Client(credentials);
	}
	

	/**
	 * @return the ec2
	 */
	public AmazonEC2 getEc2Client() {
		return ec2;
	}
	
	public String getAMInstanceName(){
		return instanceId;
	}
	
	public void createAMInstanceSmall(String amiId, String keyPairName) throws Exception{
//      US-East (Northern Virginia) Region= ec2.us-east-1.amazonaws.com
//      US-West (Northern California) Region= ec2.us-west-1.amazonaws.com
//      EU (Ireland) Region = ec2.eu-west-1.amazonaws.com
//      Asia Pacific (Singapore) Region= ec2.ap-southeast-1.amazonaws.com
		createAMInstances(amiId, 1, 1, keyPairName, "m1.small", "us-east-1a" );
		
		//create and Assign to first Instance an Elastic IP (this is not neccessary.. we will give the ns)
//        AllocateAddressResult alocAddrRes = this.ec2.allocateAddress();
//        publicIp = alocAddrRes.getPublicIp();        
//        AssociateAddressRequest assocAddrreq = new AssociateAddressRequest();
//        assocAddrreq.setInstanceId(instanceId);
//        assocAddrreq.setPublicIp(publicIp);
//        System.out.println("Your publicIp = " + publicIp +", and is associated to instance = "+instanceId);
        
		//wraio einai na synde8w me to keypair mesw ssh client kai na balw username kai password pou exei o xristis mas sto panlab
	}
	
	public void createAMInstances(String AMId, int min, int max, String keyPairName,String insType, String availabilityZone ) throws Exception
	{
		RunInstancesRequest request = new RunInstancesRequest();	
		request.setInstanceType( insType );
		request.setMinCount(min);	
		request.setMaxCount(max);
		//set to zone
		Placement p = new Placement();
		p.setAvailabilityZone(availabilityZone);
		request.setPlacement(p);
		request.setImageId(AMId);
		//Create key pair for user
		CreateKeyPairRequest kpReq = new CreateKeyPairRequest();
		kpReq.setKeyName(keyPairName);
		CreateKeyPairResult  kpres = this.ec2.createKeyPair(kpReq ); 
		keyPair = kpres.getKeyPair();
		//we must have the key ready to report it to the user or
		//wraio einai na synde8w me to keypair mesw ssh client kai na balw username kai password pou exei o xristis mas sto panlab
        
        System.out.println("You havekeyPair.getKeyName = " + keyPair.getKeyName() + 
        		"\nkeyPair.getKeyFingerprint()="+ keyPair.getKeyFingerprint() + 
        		"\nkeyPair.getKeyMaterial()="+ keyPair.getKeyMaterial() );
        //the key material should be copied to a file and give to the user!
		request.setKeyName(keyPairName);//assign Keypair name for this request

		//request.getSecurityGroups().add("groupname");//create security groups if you want
		//create it!WARNING the security group will be default! 
		//make sure to have access to SSH port 22 on the default group on the EC2console
		RunInstancesResult runInstancesRes = this.ec2.runInstances(request);
		this.ReservationId = runInstancesRes.getReservation().getReservationId();
		
		
		
		//with a new temp EC2 because it must be refreshed probably
		//EC2Wrapper tempoec2 = new EC2Wrapper(credentials.getAWSAccessKeyId(), credentials.getAWSSecretKey());
		ec2 = new AmazonEC2Client(credentials);
	       
		while ( (this.publicDnsName.equals("-")) || ("".equals(this.publicDnsName)) ) {
			DescribeInstancesResult describeInstancesRequest = ec2.describeInstances();
	        List<Reservation> reservations = describeInstancesRequest.getReservations();
	        Set<Instance> instances = new HashSet<Instance>();
	       
	        System.out.println("Let's wait 30 secs...." );
	        Thread.currentThread().sleep(30000); 
			
	        for (Reservation reservation : reservations ) {
	//            System.out.println("reservation.getReservationId() = " + reservation.getReservationId());
	//            System.out.println("this.ReservationId = " + this.ReservationId);
	            instances.addAll(reservation.getInstances());
	            if (reservation.getReservationId().equals( this.ReservationId) ){
	            	this.instanceId = ( (Instance)reservation.getInstances().get(0)).getInstanceId() ;
	            	this.publicDnsName = ( (Instance)reservation.getInstances().get(0)).getPublicDnsName() ;
	                System.out.println("this.instanceId = " + this.instanceId);
	                //if not get here the pubDNS after sleep 60 then do it with a new client
	                System.out.println("this.publicDnsName = " + this.publicDnsName);
	            }
	        }
	        System.out.println("You have " + instances.size() + " Amazon EC2 instance(s).");

	        System.out.println("Let's wait 30 secs more....before giving to user" );
	        Thread.currentThread().sleep(30000); 
	        
		}//end while
		
	}
	
	public void terminateAMIs() throws Exception {
		try {
			TerminateInstancesRequest rq = new TerminateInstancesRequest();

			rq.getInstanceIds().add(this.instanceId);

			TerminateInstancesResult rsp = this.ec2.terminateInstances(rq);

		} catch (Exception ex) {
			throw ex;
		}
	}
}
