package md5d5150985cbd7984ddcc83ee421dcce91;


public class ActionCallback_1
	extends md5d5150985cbd7984ddcc83ee421dcce91.VKCallback_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("VKontakte.ActionCallback`1, VKontakte.Android", ActionCallback_1.class, __md_methods);
	}


	public ActionCallback_1 ()
	{
		super ();
		if (getClass () == ActionCallback_1.class)
			mono.android.TypeManager.Activate ("VKontakte.ActionCallback`1, VKontakte.Android", "", this, new java.lang.Object[] {  });
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
