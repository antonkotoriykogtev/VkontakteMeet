package md5cb34bc68680879d257ad010a42988b90;


public class GraphRequestAsyncTask
	extends android.os.AsyncTask
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_doInBackground:([Ljava/lang/Object;)Ljava/lang/Object;:GetDoInBackground_arrayLjava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Facebook.GraphRequestAsyncTask, Xamarin.Facebook.Common.Android", GraphRequestAsyncTask.class, __md_methods);
	}


	public GraphRequestAsyncTask ()
	{
		super ();
		if (getClass () == GraphRequestAsyncTask.class)
			mono.android.TypeManager.Activate ("Xamarin.Facebook.GraphRequestAsyncTask, Xamarin.Facebook.Common.Android", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Object doInBackground (java.lang.Object[] p0)
	{
		return n_doInBackground (p0);
	}

	private native java.lang.Object n_doInBackground (java.lang.Object[] p0);

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
