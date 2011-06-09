package org.panlab.software.fstoolkit.localprovisioningengine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

public enum ProvisionJobAction implements Enumerator {
	
	/**
	 * The '<em><b>PROVISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISION_VALUE
	 * @ordered
	 */
	PROVISION(0, "PROVISION", "PROVISION"),

	/**
	 * The '<em><b>SHUT_DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUT_DOWN_VALUE
	 * @ordered
	 */
	SHUT_DOWN(1, "SHUT_DOWN", "SHUT_DOWN"),
	
	/**
	 * The '<em><b>SHUT_DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUT_DOWN_VALUE
	 * @ordered
	 */
	SHUT_DOWN_RESOURCE(1, "SHUT_DOWN_RESOURCE", "SHUT_DOWN_RESOURCE")
	;
	
	/**
	 * The '<em><b>PROVISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Show in the job that it must make a provision
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVISION
	 * @ordered
	 */
	public static final int PROVISION_VALUE = 0;
	
	/**
	 * The '<em><b>SHUT_DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Show in the job that it must make a shut down
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHUT_DOWN
	 * @ordered
	 */
	public static final int SHUT_DOWN_VALUE = 1;
	

	/**
	 * The '<em><b>SHUT_DOWN_RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Show in the job that it must make a shut down to a resource
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHUT_DOWN_RESOURCE
	 * @ordered
	 */
	public static final int SHUT_DOWN_RESOURCE_VALUE = 2;
	
	
	
	/**
	 * An array of all the '<em><b>Provision Job Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private static final ProvisionJobAction[] VALUES_ARRAY =
		new ProvisionJobAction[] {
			PROVISION,
			SHUT_DOWN,
			SHUT_DOWN_RESOURCE
		};

	/**
	 * A public read-only list of all the '<em><b>ProvisionJobAction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static final List<ProvisionJobAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ProvisionJobAction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProvisionJobAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvisionJobAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}
	
	/**
	 * Returns the '<em><b>Runtime Element Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static ProvisionJobAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvisionJobAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}
	
	/**
	 * Returns the '<em><b>ProvisionJobAction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProvisionJobAction get(int value) {
		switch (value) {
			case PROVISION_VALUE: return PROVISION;
			case SHUT_DOWN_VALUE: return SHUT_DOWN;
			case SHUT_DOWN_RESOURCE_VALUE: return SHUT_DOWN_RESOURCE;			
		}
		return null;
	}

	private final int value;
	private final String name;
	private final String literal;

	/**
	 * Only this class can construct instances.
	 */
	private ProvisionJobAction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	public int getValue() {
	  return value;
	}
	
	public String getName() {
	  return name;
	}

	public String getLiteral() {
	  return literal;
	}


	@Override
	public String toString() {
		return literal;
	}

}
