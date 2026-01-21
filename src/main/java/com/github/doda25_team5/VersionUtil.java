package com.github.doda25_team5;

public final class VersionUtil {

    private VersionUtil() {
        // utility class
    }

    public static String getVersion() {
        Package pkg = VersionUtil.class.getPackage();
        // check JAR manifest for version
        String version = (pkg == null) ? null : pkg.getImplementationVersion();
        return (version == null || version.isBlank()) ? "unknown" : version;
    }

    public static void printVersion() {
        System.out.println("lib-version = " + getVersion());
    }
}
