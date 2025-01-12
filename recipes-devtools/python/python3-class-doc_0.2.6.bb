SUMMARY = "Extract attributes docstrings defined in various ways"
HOMEPAGE = "https://github.com/danields761/class-doc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=12;endline=12;md5=c3f07aaf829a0fa3e19b2ed383f777ad"

SRC_URI[sha256sum] = "f5e036ed9b7f6de528affdd9f038851910b342d4c1c1252983a55ff080b530e0"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-core python3-stringold python3-more-itertools"

PYPI_PACKAGE = "class-doc"
