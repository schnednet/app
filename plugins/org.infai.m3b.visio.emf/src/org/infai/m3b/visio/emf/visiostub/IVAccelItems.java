
package org.infai.m3b.visio.emf.visiostub;

import org.jawin.*;






/**
 * Jawin generated code please do not edit
 *
 * Dispatch: IVAccelItems
 * Description: 
 * Help file:   C:\Program Files\Microsoft Office\Office12\Vis_SDR.CHM
 *
 * @author JawinTypeBrowser
 */

public class IVAccelItems extends DispatchPtr {
	public static final GUID DIID = new GUID("{000d0295-0000-0000-C000-000000000046}");
	public static final int IID_TOKEN;
	static {
		IID_TOKEN = IdentityManager.registerProxy(DIID, IVAccelItems.class);
	}

	/**
	 * The required public no arg constructor.
	 * <br><br>
	 * <b>Important:</b>Should never be used as this creates an uninitialized
	 * IVAccelItems (it is required by Jawin for some internal working though).
	 */
	public IVAccelItems() {
		super();
	}

	/**
	 * For creating a new COM-object with the given progid and with 
	 * the IVAccelItems interface.
	 * 
	 * @param progid the progid of the COM-object to create.
	 */
	public IVAccelItems(String progid) throws COMException {
		super(progid, DIID);
	}

	/**
	 * For creating a new COM-object with the given clsid and with 
	 * the IVAccelItems interface.
	 * 
	 * @param clsid the GUID of the COM-object to create.
	 */
	public IVAccelItems(GUID clsid) throws COMException {
		super(clsid, DIID);
	}

	/**
	 * For getting the IVAccelItems interface on an existing COM-object.
	 * This is an alternative to calling {@link #queryInterface(Class)}
	 * on comObject.
	 * 
	 * @param comObject the COM-object to get the IVAccelItems interface on.
	 */
	public IVAccelItems(COMPtr comObject) throws COMException {
		super(comObject);
	}

	public int getIIDToken() {
		return IID_TOKEN;
	}
	
	
    /**
    *
    
    * @return void
    **/
    /*public void QueryInterface(Object[] riid,void[] 
        [] ppvObj) throws COMException
    {
      
		invokeN("QueryInterface", new Object[] {riid, ppvObj});
        
    }*/
    /**
    *
    
    * @return int
    **/
    /*public int AddRef() throws COMException
    {
      
		return ((Integer)invokeN("AddRef", new Object[] {})).intValue();
        
    }*/
    /**
    *
    
    * @return int
    **/
    /*public int Release() throws COMException
    {
      
		return ((Integer)invokeN("Release", new Object[] {})).intValue();
        
    }*/
    /**
    *
    
    * @return void
    **/
    /*public void GetTypeInfoCount(int[] pctinfo) throws COMException
    {
      
		invokeN("GetTypeInfoCount", new Object[] {pctinfo});
        
    }*/
    /**
    *
    
    * @param itinfo
    * @param lcid
    * @return void
    **/
    /*public void GetTypeInfo(int itinfo,int lcid,void[] 
        [] pptinfo) throws COMException
    {
      
		invokeN("GetTypeInfo", new Object[] {new Integer(itinfo), new Integer(lcid), pptinfo});
        
    }*/
    /**
    *
    
    * @param cNames
    * @param lcid
    * @return void
    **/
    /*public void GetIDsOfNames(Object[] riid,int[] 
        [] rgszNames,int cNames,int lcid,int[] rgdispid) throws COMException
    {
      
		invokeN("GetIDsOfNames", new Object[] {riid, rgszNames, new Integer(cNames), new Integer(lcid), rgdispid});
        
    }*/
    /**
    *
    
    * @param dispidMember
    * @param lcid
    * @param wFlags
    * @return void
    **/
    /*public void Invoke(int dispidMember,Object[] riid,int lcid,short wFlags,Object[] pdispparams,Variant[] pvarResult,Object[] pexcepinfo,int[] puArgErr) throws COMException
    {
      
		invokeN("Invoke", new Object[] {new Integer(dispidMember), riid, new Integer(lcid), new Short(wFlags), pdispparams, pvarResult, pexcepinfo, puArgErr});
        
    }*/
    /**
    *
    * @return IUnknown
    **/
    public IUnknown get_NewEnum() throws COMException
    {
         return (IUnknown)get("_NewEnum");
    }
        
    /**
    *
    * @return void
    **/
    public IVAccelItem getItem(int lIndex) throws COMException
    {
        IVAccelItem res = new IVAccelItem();
          DispatchPtr dispPtr = (DispatchPtr)get("Item", new Integer(lIndex));
          res.stealUnknown(dispPtr);
          return res;
    }
        
    /**
    *
    
    * @return void
    **/
    public IVAccelItem Add() throws COMException
    {
      IVAccelItem res = new IVAccelItem();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("Add", new Object[] {});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    * @return int
    **/
    public int getCount() throws COMException
    {
        return ((Integer)get("Count")).intValue();
    }
        
    /**
    *
    * @return void
    **/
    public IVAccelTable getParent() throws COMException
    {
        IVAccelTable res = new IVAccelTable();
          DispatchPtr dispPtr = (DispatchPtr)get("Parent");
          res.stealUnknown(dispPtr);
          return res;
    }
        
}
