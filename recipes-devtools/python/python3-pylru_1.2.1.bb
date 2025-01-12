SUMMARY = "A least recently used (LRU) cache implementation"
HOMEPAGE = "https://github.com/jlhutch/pylru"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI[sha256sum] = "47ad140a63ab9389648dadfbb4330700e0ffeeb28ec04664ee47d37ed133b0f4"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-core python3-math"

PYPI_PACKAGE = "pylru"
