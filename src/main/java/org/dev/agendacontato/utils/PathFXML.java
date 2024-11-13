package org.dev.agendacontato.utils;

import java.nio.file.Paths;

public class PathFXML {

    public static String getPathFXML(){
        return Paths.get("src/main/java/org/dev/agendacontato/view").toFile().getAbsolutePath().replace("/","\\")+"\\";
    }
}
