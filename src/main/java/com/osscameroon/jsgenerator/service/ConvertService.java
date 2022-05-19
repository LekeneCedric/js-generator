package com.osscameroon.jsgenerator.service;

import com.osscameroon.jsgenerator.exception.HTMLUnknownElementException;

/**
 * Provides the convertion logic from Html to Js.
 *
 * @author Fanon Jupkwo
 * @author Elroy Kanye
 *
 */
public interface ConvertService {

    /**
     * Converts the Html string to Js string and prints it out.
     *
     * @param content the Html string
     * @return a String Object containing Js
     * @throws HTMLUnknownElementException if the element is not a valid HTML tag
     */

    String convert(String content) throws HTMLUnknownElementException;

    /**
     * Converts the Html file already located in
     * "src/main/resources/htmlFilesInput/" to Js file generated in
     * "src/main/resources/jsFilesOutput/" folder. Concerning this library, by
     * default, the input folder exists but the output folder don't. Likewise, When
     * a project will use jsgenerator as dependency or plugin, an input folder will
     * be created as soon as possible its classpath will contain jsgenerator.
     *
     * @param htmlFileName the Html file name
     * @throws HTMLUnknownElementException if the element is not a valid HTML tag
     */

    void convertHtmlFiletoJsFileFromCommandLineInterface(String htmlFileName) throws HTMLUnknownElementException;

    /**
     * Converts the Html file to Js file generated in output folder.
     *
     * It is similar to
     * {@link com.osscameroon.jsgenerator.service.ConvertService#convertHtmlFiletoJsFileFromCommandLineInterface(String)}
     * but it will be useful for the web API.
     *
     * @param htmlFileName the Html file name
     * @param outputFolder the output folder containing the generated Js file
     */

    void convertHtmlFiletoJsFileFromWeb(String htmlFileName, String outputFolder);

}