package tundra.collection.list;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-04-14 08:21:54.073
// -----( ON-HOST: 192.168.66.129

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class string

{
	// ---( internal utility methods )---

	final static string _instance = new string();

	static string _newInstance() { return new string(); }

	static string _cast(Object o) { return (string)o; }

	// ---( server methods )---




	public static final void append (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(append)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] record:0:optional $items
		// [o] object:0:required $list
		tundra.collection.list.object.append(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void arrayify (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(arrayify)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [o] field:1:optional $array
		tundra.collection.list.object.arrayify(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void clear (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(clear)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [o] object:0:required $list
		tundra.collection.list.object.clear(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void first (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(first)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [o] field:0:optional $item
		// [o] field:0:required $item.exists?
		tundra.collection.list.object.first(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void get (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(get)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:required $index
		// [i] field:0:optional $index.base {&quot;0&quot;,&quot;1&quot;}
		// [o] field:0:optional $item
		// [o] field:0:required $item.exists?
		tundra.collection.list.object.get(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void insert (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(insert)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] record:0:optional $items
		// [i] field:0:required $index
		// [i] field:0:optional $index.base {&quot;0&quot;,&quot;1&quot;}
		// [o] object:0:required $list
		tundra.collection.list.object.insert(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void last (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(last)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [o] field:0:optional $item
		// [o] field:0:required $item.exists?
		tundra.collection.list.object.last(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void length (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(length)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [o] field:0:required $length
		tundra.collection.list.object.length(pipeline);
		// --- <<IS-END>> ---


	}



	public static final void listify (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(listify)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $array
		// [o] object:0:optional $list
		tundra.collection.list.object.listify(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void prepend (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(prepend)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] record:0:optional $items
		// [o] object:0:required $list
		tundra.collection.list.object.prepend(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void remove (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(remove)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:required $index
		// [i] field:0:optional $index.base {&quot;0&quot;,&quot;1&quot;}
		// [o] field:0:optional $item
		// [o] field:0:required $item.exists?
		tundra.collection.list.object.remove(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void reverse (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(reverse)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [o] object:0:optional $list.reverse
		tundra.collection.list.object.reverse(pipeline);
		// --- <<IS-END>> ---


	}



	public static final void set (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(set)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:optional $item.new
		// [i] field:0:required $index
		// [i] field:0:optional $index.base {&quot;0&quot;,&quot;1&quot;}
		// [i] field:0:optional $class
		// [o] field:0:optional $item.old
		tundra.collection.list.object.set(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void take (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(take)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [i] field:0:required $count
		// [o] object:0:optional $list.head
		tundra.collection.list.object.take(pipeline, String.class);
		// --- <<IS-END>> ---


	}



	public static final void unique (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unique)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $list
		// [o] object:0:optional $list.unique
		tundra.collection.list.object.unique(pipeline);
		// --- <<IS-END>> ---


	}
}

