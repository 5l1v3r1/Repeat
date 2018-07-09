package staticResources;

import java.io.File;

import core.languageHandler.Language;
import utilities.FileUtility;

public class ScalaResources extends AbstractNativeBootstrapResource {

	@Override
	protected boolean correctExtension(String name) {
		return name.endsWith(".jar");
	}

	@Override
	protected String getRelativeSourcePath() {
		return "natives/scala";
	}

	@Override
	protected File getExtractingDest() {
		return new File(FileUtility.joinPath("resources", "scala"));
	}

	@Override
	protected Language getLanguage() {
		return Language.SCALA;
	}

	@Override
	protected boolean generateKeyCode() {
		return true; // No need
	}

	@Override
	public File getIPCClient() {
		return new File("resources/scala/RepeatScala.jar");
	}

}
