package md569cfc41c7360b0fc315cca19bb7c27f7;


public class AndroidOAuthService
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Login.Droid.AndroidOAuthService, Login.Droid", AndroidOAuthService.class, __md_methods);
	}


	public AndroidOAuthService ()
	{
		super ();
		if (getClass () == AndroidOAuthService.class)
			mono.android.TypeManager.Activate ("Login.Droid.AndroidOAuthService, Login.Droid", "", this, new java.lang.Object[] {  });
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
