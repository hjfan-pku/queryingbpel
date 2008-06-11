/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Msg Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				XSD Authors: The child element correlations needs to be a Local Element Declaration, 
 * 				because there is another correlations element defined for the invoke activity.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getFromParts <em>From Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getMessageExchange <em>Message Exchange</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getPartnerLink <em>Partner Link</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnMsgCommon()
 * @model extendedMetaData="name='tOnMsgCommon' kind='elementOnly'"
 * @generated
 */
public interface OnMsgCommon extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlations</em>' containment reference.
	 * @see #setCorrelations(Correlations)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnMsgCommon_Correlations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='correlations' namespace='##targetNamespace'"
	 * @generated
	 */
	Correlations getCorrelations();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getCorrelations <em>Correlations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlations</em>' containment reference.
	 * @see #getCorrelations()
	 * @generated
	 */
	void setCorrelations(Correlations value);

	/**
	 * Returns the value of the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Parts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Parts</em>' containment reference.
	 * @see #setFromParts(FromParts)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnMsgCommon_FromParts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fromParts' namespace='##targetNamespace'"
	 * @generated
	 */
	FromParts getFromParts();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getFromParts <em>From Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Parts</em>' containment reference.
	 * @see #getFromParts()
	 * @generated
	 */
	void setFromParts(FromParts value);

	/**
	 * Returns the value of the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Exchange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Exchange</em>' attribute.
	 * @see #setMessageExchange(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnMsgCommon_MessageExchange()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='messageExchange'"
	 * @generated
	 */
	String getMessageExchange();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getMessageExchange <em>Message Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchange</em>' attribute.
	 * @see #getMessageExchange()
	 * @generated
	 */
	void setMessageExchange(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnMsgCommon_Operation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='operation'"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Link</em>' attribute.
	 * @see #setPartnerLink(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnMsgCommon_PartnerLink()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='partnerLink'"
	 * @generated
	 */
	String getPartnerLink();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getPartnerLink <em>Partner Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Link</em>' attribute.
	 * @see #getPartnerLink()
	 * @generated
	 */
	void setPartnerLink(String value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' attribute.
	 * @see #setPortType(QName)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnMsgCommon_PortType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='portType'"
	 * @generated
	 */
	QName getPortType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getPortType <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' attribute.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(QName value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage#getOnMsgCommon_Variable()
	 * @model dataType="org.open.oasis.docs.wsbpel._2._0.process.executable.BPELVariableName"
	 *        extendedMetaData="kind='attribute' name='variable'"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

} // OnMsgCommon
