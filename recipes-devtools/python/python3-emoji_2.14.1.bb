SUMMARY = "Emoji for Python"
HOMEPAGE = "https://github.com/carpedm20/emoji/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f1ce6ea8cc2d4e84e717e050278ca26b"

SRC_URI[sha256sum] = "f8c50043d79a2c1410ebfae833ae1868d5941a67a6cd4d18377e2eb0bd79346b"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "emoji"
RDEPENDS:${PN} = "python3-typing-extensions"
