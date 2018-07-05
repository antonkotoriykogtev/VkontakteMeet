package md569cfc41c7360b0fc315cca19bb7c27f7;


public class AndroidVkService
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Login.Droid.AndroidVkService, Login.Droid", AndroidVkService.class, __md_methods);
	}


	public AndroidVkService ()
	{
		super ();
		if (getClass () == AndroidVkService.class)
			mono.android.TypeManager.Activate ("Login.Droid.AndroidVkService, Login.Droid", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
