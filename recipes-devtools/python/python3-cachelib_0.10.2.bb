SUMMARY = "A collection of cache libraries in the same API interface."
HOMEPAGE = "https://github.com/pallets-eco/cachelib/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=64768ac879e3507b7e00379a63c2075b"

SRC_URI[sha256sum] = "593faeee62a7c037d50fc835617a01b887503f972fb52b188ae7e50e9cb69740"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-core"

PYPI_PACKAGE = "cachelib"
