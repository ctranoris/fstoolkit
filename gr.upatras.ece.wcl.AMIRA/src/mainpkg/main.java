package mainpkg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.Address;
import com.amazonaws.services.ec2.model.CreateImageRequest;
import com.amazonaws.services.ec2.model.DescribeAddressesResult;
import com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.DescribeRegionsResult;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.Reservation;

public class main {

	/**
	 * @param args
	 */
   // static AmazonEC2      ec2;
    
    
	public static void main(String[] args) throws Exception {
		System.out.println("===========================================");
        System.out.println("Welcome to the AWS RA Java example!");
        System.out.println("===========================================");	
        
//        AWSCredentials credentials = new PropertiesCredentials(
//                AwsConsoleApp.class.getResourceAsStream("AwsCredentials.properties"));

//        EC2Wrapper ec2 = new EC2Wrapper(credentials.getAWSAccessKeyId(), credentials.getAWSSecretKey());
        //ec2.createAMInstanceSmall("ami-2cb05345", "ctranoris_key");	//here panlab username for the keypair name!

        
        System.out.println("SSHExec now.... " );
//        SSHExec ss = new SSHExec("root", "", 
//        		ec2.getPublicDnsName(),//"ec2-75-101-224-66.compute-1.amazonaws.com" , 
//        		22, 
//        		///etc/ssh/sshd_config ... PaaswordAuthenitcation yes (just remove it)
//        		//cp the file temporarily and then do
//        		//[18:00:28] pierpaolo: 
//        		//cp /etc/ssh/sshd_config /tmp/sshd_config; cat /tmp/sshd_config|grep -v PasswordAuthentication >/etc/ssh/sshd_config;/etc/init.d/sshd restart
//        		// /etc/init.d/sshd restart but I must check
//        		"ls -la",//"useradd -G root -p ctranoris ctranoris", //edw tou panlab..ton dimioyrgei...alla kati trexei kai to amazon se petaei eksw meta
//        		ec2.getKeyPair().getKeyMaterial()//
//        		//"C:\\Users\\ctranoris\\wsHeliosM4\\gr.upatras.ece.wcl.AMIRA\\src\\mainpkg\\sshkey" 
//        		);//
        SSHExec ss = new SSHExec("root", "vsp4p2", 
        		"150.140.184.233", 
        		22, 
        		"",//"useradd -G root -p ctranoris ctranoris", //edw tou panlab..ton dimioyrgei...alla kati trexei kai to amazon se petaei eksw meta
        		""
        		);//
        ss.runCommand( "/repo/scripts/logthis.sh /repo/scripts/rubis/xentop.sh uop.rubis_app_10" );
//        ss.runCommand( "ls -la");
        ss.disconnectSession();
        return;
        
        /*
//         * Amazon EC2
//         *
//         * The AWS EC2 client allows you to create, delete, and administer
//         * instances programmatically.
//         *
//         * In this sample, we use an EC2 client to get a list of all the
//         * availability zones, and all instances sorted by reservation id.
//         */
//        try {
//        	
//        	//ec2.getEc2Client().setEndpoint("ec2.ap-southeast-1.amazonaws.com");
////          US-East (Northern Virginia) Region= ec2.us-east-1.amazonaws.com
////          US-West (Northern California) Region= ec2.us-west-1.amazonaws.com
////          EU (Ireland) Region = ec2.eu-west-1.amazonaws.com
////          Asia Pacific (Singapore) Region= ec2.ap-southeast-1.amazonaws.com
//
//        	DescribeRegionsResult availregions = ec2.getEc2Client().describeRegions();
//        	System.out.println("You have access to " + availregions.getRegions().size() + " Availability regions.");
//        	for (int j = 0; j < availregions.getRegions().size(); j++) {
//                System.out.println("You have access to region: " +  availregions.getRegions().get(j).getRegionName() );
//                System.out.println("You have access to Endpoint: " +  availregions.getRegions().get(j).getEndpoint() );
//			}
//        	
//            DescribeAvailabilityZonesResult availabilityZonesResult = ec2.getEc2Client().describeAvailabilityZones();
//            System.out.println("You have access to " + availabilityZonesResult.getAvailabilityZones().size() + " Availability Zones.");
//
//            for (int j = 0; j < availabilityZonesResult.getAvailabilityZones().size(); j++) {
//
//                System.out.println("You have access to zone: " +  availabilityZonesResult.getAvailabilityZones().get(j).getZoneName() );
//                System.out.println("You have access to region: " +  availabilityZonesResult.getAvailabilityZones().get(j).getRegionName() );
//			}
//            DescribeInstancesResult describeInstancesRequest = ec2.getEc2Client().describeInstances();
//            List<Reservation> reservations = describeInstancesRequest.getReservations();
//            Set<Instance> instances = new HashSet<Instance>();
//
//            for (Reservation reservation : reservations) {
//                instances.addAll(reservation.getInstances());
//                List<Instance> ins = reservation.getInstances();
//                for (Instance instance : ins) {
//                    System.out.println("instance.getInstanceId() = " +instance.getInstanceId());
//                    System.out.println("instance.getPublicDnsName = " +instance.getPublicDnsName() );
//                    System.out.println("instance.getPublicIpAddress() = " +instance.getPublicIpAddress() );
//    			}
//            }
//            
////            US-East (Northern Virginia) Region= ec2.us-east-1.amazonaws.com
////            US-West (Northern California) Region= ec2.us-west-1.amazonaws.com
////            EU (Ireland) Region = ec2.eu-west-1.amazonaws.com
////            Asia Pacific (Singapore) Region= ec2.ap-southeast-1.amazonaws.com
//
//            System.out.println("You have " + instances.size() + " Amazon EC2 instance(s) running.");
//            
//            DescribeAddressesResult describeElasticIPaddresses = ec2.getEc2Client().describeAddresses();
//            List<Address> ElasticIPAddresses = describeElasticIPaddresses.getAddresses();
//            System.out.println("You have " + ElasticIPAddresses.size()  + " Amazon EC2 availElasticIPaddresses.");
//            
//            
////            ec2.setEndpoint("ec2.ap-southeast-1.amazonaws.com");
////            ec2.describeInstances();
//            
//            //ami-2cb05345
////            CreateImageRequest arg0 = new CreateImageRequest();
////			ec2.createImage(arg0 );
//            
//        } catch (AmazonServiceException ase) {
//                System.out.println("Caught Exception: " + ase.getMessage());
//                System.out.println("Reponse Status Code: " + ase.getStatusCode());
//                System.out.println("Error Code: " + ase.getErrorCode());
//                System.out.println("Request ID: " + ase.getRequestId());
//        }
	}

}
