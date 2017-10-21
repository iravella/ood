package experiments;

public class HasLongMethod {

	/**
	* Extracts the file part of a path, and removes the dot (’.’)
	* and everything after the dot from the filename.
	*
	* @param path The path from which to extract the filename.
	* @return The filename without extension. If <code>path</code>
	* is <code>a/b/c/d.doc</code>, the return value is
	* <code>d</code>.
	*/
	public String filenameWithoutExtension(String path) {
		String fileName = filenameWithoutPath(path);
		return simpleFilenameWithoutExtension(fileName);
	}
	
	private String filenameWithoutPath(String path) {
		return path.substring(path.lastIndexOf("/") + 1);
	}
	
	private String simpleFilenameWithoutExtension(String fileName) {
		if (fileName.contains(".")) {
			return fileName.substring(0, fileName.indexOf('.'));
		} else {
			return fileName;
		}
	}
}
