/*
 * Copyright (C) 2016 example.com 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.example.videoplayer.utils;

public class Log {
	public static final String TAG = "Bebeauties";

	public static void i(String msg, Object[] args) {
		if (msg == null)
			return;
		try {
			android.util.Log.i("Bebeauties", String.format(msg, args));
		} catch (Exception e) {
			android.util.Log.e("Bebeauties", "me.abitno.utils.Log", e);
			android.util.Log.i("Bebeauties", msg);
		}
	}

	public static void d(String msg, Object[] args) {
		if (msg == null)
			return;
		try {
			android.util.Log.d("Bebeauties", String.format(msg, args));
		} catch (Exception e) {
			android.util.Log.e("Bebeauties", "me.abitno.utils.Log", e);
			android.util.Log.d("Bebeauties", msg);
		}
	}

	public static void e(String msg, Object[] args) {
		if (msg == null)
			return;
		try {
			android.util.Log.e("Bebeauties", String.format(msg, args));
		} catch (Exception e) {
			android.util.Log.e("Bebeauties", "me.abitno.utils.Log", e);
			android.util.Log.e("Bebeauties", msg);
		}
	}

	public static void e(String msg, Throwable t) {
		if (msg == null)
			return;
		android.util.Log.e("Bebeauties", msg, t);
	}
}
