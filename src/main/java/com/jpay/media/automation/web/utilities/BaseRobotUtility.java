package com.jpay.media.automation.web.utilities;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

import com.google.common.base.CharMatcher;

public class BaseRobotUtility {

	private static final int MOUSE_LEFT = InputEvent.BUTTON1_MASK;
	private static final int MOUSE_MIDDLE = InputEvent.BUTTON2_MASK;
	private static final int MOUSE_RIGHT = InputEvent.BUTTON3_MASK;

	private static final String KEY_ENTER = "Enter";
	private static final String KEY_ESC = "ESC";
	private static final String KEY_TAB = "TAB";
	private static final String KEY_CAPS_LOCK = "CAPS LOCK";
	private static final String KEY_BACKSPACE = "BACKSPACE";
	private static final String KEY_INS = "INS";
	private static final String KEY_DEL = "DEL";
	private static final String KEY_PGUP = "PGUP";
	private static final String KEY_PGDN = "PGDN";
	private static final String KEY_HOME = "HOME";
	private static final String KEY_END = "END";
	private static final String KEY_UP = "UP";
	private static final String KEY_DOWN = "DOWN";
	private static final String KEY_LEFT = "LEFT";
	private static final String KEY_RIGHT = "RIGHT";
	private static final String KEY_FN1 = "FN1";
	private static final String KEY_FN2 = "FN2";
	private static final String KEY_FN3 = "FN3";
	private static final String KEY_FN4 = "FN4";
	private static final String KEY_FN5 = "FN5";
	private static final String KEY_FN6 = "FN6";
	private static final String KEY_FN7 = "FN7";
	private static final String KEY_FN8 = "FN8";
	private static final String KEY_FN9 = "FN9";
	private static final String KEY_FN10 = "FN10";
	private static final String KEY_FN11 = "FN11";
	private static final String KEY_FN12 = "FN12";

	private static final int KEYPRESS_DELAY_MS = 50;
	private static HashMap<Character, Character> SHIFTED_CHAR_SET;
	private static HashMap<String, Integer> SPECIAL_KEY_MAP;
	protected Robot robot;

	public ExtentManager extent = ExtentManager.getInstance();
	protected static BaseRobotUtility instance = null;
	private static int defaultGuiDelay = 1000;

	public void logging(String msg) {

		extent.log(msg);
		Log.info(msg);
	}

	public void loggingWithLabel(String msg) {

		extent.labelLog(msg);
		Log.info(msg);
	}

	static {

		SPECIAL_KEY_MAP = new HashMap<String, Integer>();
		SPECIAL_KEY_MAP.put(KEY_ENTER, KeyEvent.VK_ENTER);
		SPECIAL_KEY_MAP.put(KEY_ESC, KeyEvent.VK_ESCAPE);
		SPECIAL_KEY_MAP.put(KEY_TAB, KeyEvent.VK_TAB);
		SPECIAL_KEY_MAP.put(KEY_CAPS_LOCK, KeyEvent.VK_CAPS_LOCK);
		SPECIAL_KEY_MAP.put(KEY_BACKSPACE, KeyEvent.VK_BACK_SPACE);
		SPECIAL_KEY_MAP.put(KEY_INS, KeyEvent.VK_INSERT);
		SPECIAL_KEY_MAP.put(KEY_DEL, KeyEvent.VK_DELETE);
		SPECIAL_KEY_MAP.put(KEY_PGUP, KeyEvent.VK_PAGE_UP);
		SPECIAL_KEY_MAP.put(KEY_PGDN, KeyEvent.VK_PAGE_DOWN);
		SPECIAL_KEY_MAP.put(KEY_HOME, KeyEvent.VK_HOME);
		SPECIAL_KEY_MAP.put(KEY_END, KeyEvent.VK_END);
		SPECIAL_KEY_MAP.put(KEY_UP, KeyEvent.VK_UP);
		SPECIAL_KEY_MAP.put(KEY_DOWN, KeyEvent.VK_DOWN);
		SPECIAL_KEY_MAP.put(KEY_LEFT, KeyEvent.VK_LEFT);
		SPECIAL_KEY_MAP.put(KEY_RIGHT, KeyEvent.VK_RIGHT);
		SPECIAL_KEY_MAP.put(KEY_FN1, KeyEvent.VK_F1);
		SPECIAL_KEY_MAP.put(KEY_FN2, KeyEvent.VK_F2);
		SPECIAL_KEY_MAP.put(KEY_FN3, KeyEvent.VK_F3);
		SPECIAL_KEY_MAP.put(KEY_FN4, KeyEvent.VK_F4);
		SPECIAL_KEY_MAP.put(KEY_FN5, KeyEvent.VK_F5);
		SPECIAL_KEY_MAP.put(KEY_FN6, KeyEvent.VK_F6);
		SPECIAL_KEY_MAP.put(KEY_FN7, KeyEvent.VK_F7);
		SPECIAL_KEY_MAP.put(KEY_FN8, KeyEvent.VK_F8);
		SPECIAL_KEY_MAP.put(KEY_FN9, KeyEvent.VK_F9);
		SPECIAL_KEY_MAP.put(KEY_FN10, KeyEvent.VK_F10);
		SPECIAL_KEY_MAP.put(KEY_FN11, KeyEvent.VK_F11);
		SPECIAL_KEY_MAP.put(KEY_FN12, KeyEvent.VK_F12);

		SHIFTED_CHAR_SET = new HashMap<Character, Character>();
		SHIFTED_CHAR_SET.put('A', 'a');
		SHIFTED_CHAR_SET.put('B', 'c');
		SHIFTED_CHAR_SET.put('C', 'c');
		SHIFTED_CHAR_SET.put('D', 'd');
		SHIFTED_CHAR_SET.put('E', 'e');
		SHIFTED_CHAR_SET.put('F', 'f');
		SHIFTED_CHAR_SET.put('G', 'g');
		SHIFTED_CHAR_SET.put('H', 'h');
		SHIFTED_CHAR_SET.put('I', 'i');
		SHIFTED_CHAR_SET.put('J', 'j');
		SHIFTED_CHAR_SET.put('K', 'k');
		SHIFTED_CHAR_SET.put('L', 'l');
		SHIFTED_CHAR_SET.put('M', 'm');
		SHIFTED_CHAR_SET.put('N', 'n');
		SHIFTED_CHAR_SET.put('O', 'o');
		SHIFTED_CHAR_SET.put('P', 'p');
		SHIFTED_CHAR_SET.put('Q', 'q');
		SHIFTED_CHAR_SET.put('R', 'r');
		SHIFTED_CHAR_SET.put('S', 's');
		SHIFTED_CHAR_SET.put('T', 't');
		SHIFTED_CHAR_SET.put('U', 'u');
		SHIFTED_CHAR_SET.put('V', 'v');
		SHIFTED_CHAR_SET.put('W', 'w');
		SHIFTED_CHAR_SET.put('X', 'x');
		SHIFTED_CHAR_SET.put('Y', 'y');
		SHIFTED_CHAR_SET.put('Z', 'z');

		SHIFTED_CHAR_SET.put('!', '1');
		SHIFTED_CHAR_SET.put('@', '2');
		SHIFTED_CHAR_SET.put('#', '3');
		SHIFTED_CHAR_SET.put('$', '4');
		SHIFTED_CHAR_SET.put('%', '5');
		SHIFTED_CHAR_SET.put('^', '6');
		SHIFTED_CHAR_SET.put('&', '7');
		SHIFTED_CHAR_SET.put('*', '8');
		SHIFTED_CHAR_SET.put('(', '9');
		SHIFTED_CHAR_SET.put(')', '0');
		SHIFTED_CHAR_SET.put('~', '`');
		SHIFTED_CHAR_SET.put('+', '=');
		SHIFTED_CHAR_SET.put('_', '-');
		SHIFTED_CHAR_SET.put('{', '[');
		SHIFTED_CHAR_SET.put('}', ']');
		SHIFTED_CHAR_SET.put('|', '\\');
		SHIFTED_CHAR_SET.put(':', ';');
		SHIFTED_CHAR_SET.put('"', '\'');
		SHIFTED_CHAR_SET.put('<', ',');
		SHIFTED_CHAR_SET.put('>', '.');
		SHIFTED_CHAR_SET.put('?', '/');

	}

	public BaseRobotUtility() {
		try {
			robot = new Robot();
			robot.setAutoDelay(defaultGuiDelay);
			robot.setAutoWaitForIdle(true);

		} catch (AWTException awte) {
			throw new RuntimeException(awte);
		}
	}

	public static BaseRobotUtility getInstance() {

		if (instance == null) {
			instance = new BaseRobotUtility();
			instance.setAutoDelay(defaultGuiDelay);
			instance.setAutoWaitForIdle(true);

		}
		return instance;
	}

	public void setAutoDelay(int ms) {

		robot.setAutoDelay(ms);
	}

	public void setAutoWaitForIdle(boolean wait) {

		robot.setAutoWaitForIdle(wait);
	}

	public int getAutoDelay() {

		return robot.getAutoDelay();
	}

	public int getDefaultGuiDelayDelay() {

		return defaultGuiDelay;
	}

	public void pressKey(String keypresses) {

		for (char keypress : keypresses.toCharArray()) {
			if (SHIFTED_CHAR_SET.containsKey(keypress)) {
				pressShiftKey(SHIFTED_CHAR_SET.get(keypress));
			} else {
				pressKey(keypress);

			}

		}

	}

	public void pressKey(char keypress) {
		pressKey(KeyEvent.getExtendedKeyCodeForChar(keypress));
	}

	public void pressKey(int keycode) {
		robot.keyPress(keycode);
		releaseKey(keycode);
	}

	public void releaseKey(int keycode) {
		robot.keyRelease(keycode);
		robot.delay(KEYPRESS_DELAY_MS);
	}

	public void pressControlKey(char keypress) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		pressKey(keypress);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	public void pressAltKey(char keypress) {
		robot.keyPress(KeyEvent.VK_ALT);
		pressKey(keypress);
		robot.keyRelease(KeyEvent.VK_ALT);
	}

	public void pressAltTabKeys(char keypress) {
		robot.keyPress(KeyEvent.VK_ALT);
		pressTabKey();
		robot.keyRelease(KeyEvent.VK_ALT);
	}

	public void pressShiftKey(char keypress) {
		robot.keyPress(KeyEvent.VK_SHIFT);
		pressKey(keypress);
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}

	public void pressTabKey() {
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	public void pause(int seconds) {
		robot.delay(seconds * 1000);
	}

	public void mouseMove(Point point) {
		try {
			robot.mouseMove(point.x, point.y);
			robot.delay(defaultGuiDelay);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click(Point point) {

		try {
			mouseMove(point);
			robot.mousePress(MOUSE_LEFT);
			robot.delay(defaultGuiDelay);
			robot.mouseRelease(MOUSE_LEFT);
			robot.delay(defaultGuiDelay);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void rightClick(Point point) {

		try {
			mouseMove(point);
			robot.mousePress(MOUSE_RIGHT);
			robot.delay(defaultGuiDelay);
			robot.mouseRelease(MOUSE_RIGHT);
			robot.delay(defaultGuiDelay);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click(Point point, int mouseModifiers) {

		try {
			mouseMove(point);
			robot.mousePress(mouseModifiers);
			robot.delay(defaultGuiDelay);
			robot.mouseRelease(mouseModifiers);
			robot.delay(defaultGuiDelay);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doubleClick(Point point) {

		try {
			mouseMove(point);
			robot.mousePress(MOUSE_LEFT);
			robot.delay(KEYPRESS_DELAY_MS);
			robot.mouseRelease(MOUSE_LEFT);
			robot.delay(KEYPRESS_DELAY_MS);
			robot.mousePress(MOUSE_LEFT);
			robot.delay(KEYPRESS_DELAY_MS);
			robot.mouseRelease(MOUSE_LEFT);
			robot.delay(KEYPRESS_DELAY_MS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void keyPress(int keycode) {
		robot.delay(KEYPRESS_DELAY_MS);
		robot.keyPress(keycode);
	}

	public void type(int keycode) {
		robot.delay(KEYPRESS_DELAY_MS);
		robot.keyPress(keycode);
		robot.keyRelease(keycode);
	}

	public void typeEx(String text) {
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection stringSelection = new StringSelection(text);
		clipboard.setContents(stringSelection, stringSelection);

		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(KEYPRESS_DELAY_MS);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
	}

	public void pressControlF4() {

		robot.delay(1500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_F4);
	}

	public void type(String s) {
		byte[] bytes = s.getBytes();
		for (byte b : bytes) {
			int code = b;
			if (code > 96 && code < 123)
				code = code - 32;

			robot.delay(KEYPRESS_DELAY_MS);
			robot.keyPress(code);
			robot.keyRelease(code);
		}
	}

	public void pastFromClipboard() {
		robot.delay(KEYPRESS_DELAY_MS);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
	}

	public void pressEnter() {
		robot.delay(KEYPRESS_DELAY_MS);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void windowsHalfMinimize() {
		robot.delay(KEYPRESS_DELAY_MS);
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(KEYPRESS_DELAY_MS);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

	public void windowsFullMinimize() {
		this.windowsHalfMinimize();
		this.windowsHalfMinimize();
	}

	public static String getUniqueFileName(String nameStartName, String FileExist) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		nameStartName = nameStartName + "_" + dateFormat.format(new Date());
		nameStartName = CharMatcher.anyOf("- ,").replaceFrom(nameStartName, "_") + "." + FileExist;
		return nameStartName;
	}

	public static List<String> usPhoneNumber(String str) {
		List<String> phNum = new ArrayList<String>();
		String regexPhNum = "\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})";
		Pattern patternPh = Pattern.compile(regexPhNum);
		Matcher matcherPh = patternPh.matcher(str);
		while (matcherPh.find()) {
			phNum.add(matcherPh.group());
		}
		return phNum;
	}

	public static List<String> emailAddress(String str) {
		List<String> emails = new ArrayList<String>();
		String regexemails = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+";
		Pattern patternemails = Pattern.compile(regexemails);
		Matcher matcheremails = patternemails.matcher(str);
		while (matcheremails.find()) {
			emails.add(matcheremails.group());
		}
		return emails;
	}

	public byte[] takeScreenShot() {
		byte[] imageInByte = null;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		Rectangle rectangle = new Rectangle(0, 0, screenSize.width, screenSize.height);

		try {

			Robot robot = new Robot();
			BufferedImage image = robot.createScreenCapture(rectangle);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(image, "png", baos);
			baos.flush();
			imageInByte = baos.toByteArray();
			baos.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		return imageInByte;
	}

	public String takeScreenShot(String path) {
		String imageFileName = null;
		byte[] img = takeScreenShot();

		if (!path.endsWith(File.separator)) {
			path = path + File.separator;
		}

		File dir = new File(path);

		if (dir.isDirectory()) {
			FileOutputStream fos = null;

			try {
				FileUtils.forceMkdir(dir);
				String fileName = getUniqueFileName("Screenshot", "png");
				imageFileName = path + fileName;
				fos = new FileOutputStream(imageFileName);
				fos.write(img);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fos.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} else {
			throw new RuntimeException("Path is not found : " + path);
		}
		return imageFileName;

	}

}
