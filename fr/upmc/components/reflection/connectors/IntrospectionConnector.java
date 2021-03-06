package fr.upmc.components.reflection.connectors;

//Copyright Jacques Malenfant, Univ. Pierre et Marie Curie.
//
//Jacques.Malenfant@lip6.fr
//
//This software is a computer program whose purpose is to provide a
//basic component programming model to program with components
//distributed applications in the Java programming language.
//
//This software is governed by the CeCILL-C license under French law and
//abiding by the rules of distribution of free software.  You can use,
//modify and/ or redistribute the software under the terms of the
//CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
//URL "http://www.cecill.info".
//
//As a counterpart to the access to the source code and  rights to copy,
//modify and redistribute granted by the license, users are provided only
//with a limited warranty  and the software's author,  the holder of the
//economic rights,  and the successive licensors  have only  limited
//liability. 
//
//In this respect, the user's attention is drawn to the risks associated
//with loading,  using,  modifying and/or developing or reproducing the
//software by the user in light of its specific status of free software,
//that may mean  that it is complicated to manipulate,  and  that  also
//therefore means  that it is reserved for developers  and  experienced
//professionals having in-depth computer knowledge. Users are therefore
//encouraged to load and test the software's suitability as regards their
//requirements in conditions enabling the security of their systems and/or 
//data to be ensured and,  more generally, to use and operate it in the 
//same conditions as regards security. 
//
//The fact that you are presently reading this means that you have had
//knowledge of the CeCILL-C license and that you accept its terms.

import fr.upmc.components.ComponentStateI;
import fr.upmc.components.PluginI;
import fr.upmc.components.connectors.AbstractConnector;
import fr.upmc.components.reflection.interfaces.IntrospectionI;

//-----------------------------------------------------------------------------
/**
 * The class <code>IntrospectionConnector</code> defines the connector associated
 * the interface <code>IntrospectionI</code>.
 *
 * <p><strong>Description</strong></p>
 * 
 * <p><strong>Invariant</strong></p>
 * 
 * <pre>
 * invariant		true
 * </pre>
 * 
 * <p>Created on : 2018-02-16</p>
 * 
 * @author	<a href="mailto:Jacques.Malenfant@lip6.fr">Jacques Malenfant</a>
 * @version	$Name$ -- $Revision$ -- $Date$
 */
public class				IntrospectionConnector
extends		AbstractConnector
implements	IntrospectionI
{
	// ------------------------------------------------------------------------
	// Constructors
	// ------------------------------------------------------------------------

	public				IntrospectionConnector()
	{
		super() ;
	}

	// ------------------------------------------------------------------------
	// Plug-ins facilities
	// ------------------------------------------------------------------------

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#hasInstalledPlugins()
	 */
	@Override
	public boolean		hasInstalledPlugins() throws Exception
	{
		return ((IntrospectionI)this.offering).hasInstalledPlugins() ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#isInstalled(java.lang.String)
	 */
	@Override
	public boolean		isInstalled(String pluginId) throws Exception
	{
		return ((IntrospectionI)this.offering).isInstalled(pluginId) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#getPlugin(java.lang.String)
	 */
	@Override
	public PluginI		getPlugin(String pluginURI) throws Exception
	{
		return ((IntrospectionI)this.offering).getPlugin(pluginURI) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#isInitialised(java.lang.String)
	 */
	@Override
	public boolean		isInitialised(String pluginURI) throws Exception
	{
		return ((IntrospectionI)this.offering).isInitialised(pluginURI) ;
	}

	// ------------------------------------------------------------------------
	// Logging facilities
	// ------------------------------------------------------------------------

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#isLogging()
	 */
	@Override
	public boolean		isLogging() throws Exception
	{
		return ((IntrospectionI)this.offering).isLogging() ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#isTracing()
	 */
	@Override
	public boolean		isTracing() throws Exception
	{
		return ((IntrospectionI)this.offering).isTracing() ;
	}

	// ------------------------------------------------------------------------
	// Internal behaviour requests
	// ------------------------------------------------------------------------

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#isInStateAmong(fr.upmc.components.ComponentStateI[])
	 */
	@Override
	public boolean		isInStateAmong(ComponentStateI[] states)
	throws Exception
	{
		return ((IntrospectionI)this.offering).isInStateAmong(states) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#notInStateAmong(fr.upmc.components.ComponentStateI[])
	 */
	@Override
	public boolean		notInStateAmong(ComponentStateI[] states)
	throws Exception
	{
		return ((IntrospectionI)this.offering).notInStateAmong(states) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#isConcurrent()
	 */
	@Override
	public boolean		isConcurrent() throws Exception
	{
		return ((IntrospectionI)this.offering).isConcurrent() ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#canScheduleTasks()
	 */
	@Override
	public boolean		canScheduleTasks() throws Exception
	{
		return ((IntrospectionI)this.offering).canScheduleTasks() ;
	}

	// ------------------------------------------------------------------------
	// Implemented interfaces management
	// ------------------------------------------------------------------------

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#getInterfaces()
	 */
	@Override
	public Class<?>[]	getInterfaces() throws Exception
	{
		return ((IntrospectionI)this.offering).getInterfaces() ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#getInterface(java.lang.Class)
	 */
	@Override
	public Class<?>		getInterface(Class<?> inter) throws Exception
	{
		return ((IntrospectionI)this.offering).getInterface(inter) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#getRequiredInterfaces()
	 */
	@Override
	public Class<?>[]	getRequiredInterfaces() throws Exception
	{
		return ((IntrospectionI)this.offering).getRequiredInterfaces() ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#getRequiredInterface(java.lang.Class)
	 */
	@Override
	public Class<?>		getRequiredInterface(Class<?> inter) throws Exception
	{
		return ((IntrospectionI)this.offering).getRequiredInterface(inter) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#getOfferedInterfaces()
	 */
	@Override
	public Class<?>[]	getOfferedInterfaces() throws Exception
	{
		return ((IntrospectionI)this.offering).getOfferedInterfaces() ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#getOfferedInterface(java.lang.Class)
	 */
	@Override
	public Class<?>		getOfferedInterface(Class<?> inter) throws Exception
	{
		return ((IntrospectionI)this.offering).getOfferedInterface(inter) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#isInterface(java.lang.Class)
	 */
	@Override
	public boolean		isInterface(Class<?> inter) throws Exception
	{
		return ((IntrospectionI)this.offering).isInterface(inter) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#isRequiredInterface(java.lang.Class)
	 */
	@Override
	public boolean		isRequiredInterface(Class<?> inter)
	throws Exception
	{
		return ((IntrospectionI)this.offering).isRequiredInterface(inter) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#isOfferedInterface(java.lang.Class)
	 */
	@Override
	public boolean		isOfferedInterface(Class<?> inter) throws Exception
	{
		return ((IntrospectionI)this.offering).isOfferedInterface(inter) ;
	}

	// ------------------------------------------------------------------------
	// Port management
	// ------------------------------------------------------------------------

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#findPortURIsFromInterface(java.lang.Class)
	 */
	@Override
	public String[]		findPortURIsFromInterface(Class<?> inter)
	throws Exception
	{
		return ((IntrospectionI)this.offering).findPortURIsFromInterface(inter) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#findInboundPortURIsFromInterface(java.lang.Class)
	 */
	@Override
	public String[]		findInboundPortURIsFromInterface(Class<?> inter)
	throws Exception
	{
		return ((IntrospectionI)this.offering).findInboundPortURIsFromInterface(inter) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#findOutboundPortURIsFromInterface(java.lang.Class)
	 */
	@Override
	public String[]		findOutboundPortURIsFromInterface(Class<?> inter)
	throws Exception
	{
		return ((IntrospectionI)this.offering).findOutboundPortURIsFromInterface(inter) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#getPortImplementedInterface(java.lang.String)
	 */
	@Override
	public Class<?>		getPortImplementedInterface(String portURI)
	throws Exception
	{
		return ((IntrospectionI)this.offering).
										getPortImplementedInterface(portURI) ;
	}

	/**
	 * @see fr.upmc.components.reflection.interfaces.IntrospectionI#isPortConnected(java.lang.String)
	 */
	@Override
	public boolean		isPortConnected(String portURI)
	throws Exception
	{
		return ((IntrospectionI)this.offering).isPortConnected(portURI) ;
	}
}
//-----------------------------------------------------------------------------
