SUMMARY = "A collection of cache libraries in the same API interface."
HOMEPAGE = "https://github.com/pallets-eco/cachelib/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=64768ac879e3507b7e00379a63c2075b"

SRC_URI[sha256sum] = "209d8996e3c57595bee274ff97116d1d73c4980b2fd9a34c7846cd07fd2e1a48"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-core"

PYPI_PACKAGE = "cachelib"
