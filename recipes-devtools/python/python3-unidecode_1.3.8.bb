SUMMARY = "ASCII transliterations of Unicode text"
HOMEPAGE = "https://pypi.org/project/Unidecode/"

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
SRC_URI[sha256sum] = "cfdb349d46ed3873ece4586b96aa75258726e2fa8ec21d6f00a591d98806c2f4"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-core"

PYPI_PACKAGE = "Unidecode"
