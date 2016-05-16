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

public class StringUtils {
	public static String fixLastSlash(String str) {
		String res = str.trim() + "/";
		if ((res.length() > 2) && (res.charAt(res.length() - 2) == '/'))
			res = res.substring(0, res.length() - 1);
		return res;
	}

	public static int convertToInt(String str) throws NumberFormatException {
		int e, s;
		for (s = 0; s < str.length(); s++)
			if (Character.isDigit(str.charAt(s)))
				break;
		for (e = str.length(); e > 0; e--)
			if (Character.isDigit(str.charAt(e - 1)))
				break;
		if (e > s) {
			try {
				return Integer.parseInt(str.substring(s, e));
			} catch (NumberFormatException ex) {
				Log.e("convertToInt", ex);
				throw new NumberFormatException();
			}
		}
		throw new NumberFormatException();
	}

	public static String generateTime(long time) {
		int totalSeconds = (int) (time / 1000L);
		int seconds = totalSeconds % 60;
		int minutes = totalSeconds / 60 % 60;
		int hours = totalSeconds / 3600;

		return hours > 0 ? String.format("%02d:%02d:%02d", new Object[] { Integer.valueOf(hours), Integer.valueOf(minutes), Integer.valueOf(seconds) }) : String.format("%02d:%02d", new Object[] { Integer.valueOf(minutes), Integer.valueOf(seconds) });
	}

	public static boolean isBlank(String s) {
		return (s == null) || (s.trim().equals(""));
	}
}
