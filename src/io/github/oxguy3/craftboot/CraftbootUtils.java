/**
 * CraftBoot, a bootstrapper for SKCraft Launcher
 * Copyright (C) 2014 Hayden Schiff <http://oxguy3.github.io> and contributors
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.oxguy3.craftboot;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CraftbootUtils {

	public static final String PACKED_EXT = ".jar.pack";
	public static final String UNPACKED_EXT = ".jar";
	
	/**
	 * Downloads text from a given URL and returns it as a String
	 * 
	 * @return the text (or null if download failed)
	 */
	public static String downloadTextFromUrl(String url) {
		InputStream in;
		try {
			in = new URL(url).openStream();
			Scanner scan = new Scanner(in);
			return scan.hasNext() ? scan.next() : null;
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Downloads text from a given URL and returns it as a String
	 * 
	 * @return the text (or null if download failed)
	 */
	public static String getTextFromFile(File file) {
		InputStream in;
		try {
			in = new FileInputStream(file);
			Scanner scan = new Scanner(in);
			return scan.hasNext() ? scan.next() : null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
