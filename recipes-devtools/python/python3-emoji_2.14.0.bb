SUMMARY = "Emoji for Python"
HOMEPAGE = "https://github.com/carpedm20/emoji/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4799dd49db977b572103afc6d8df904e"

SRC_URI[sha256sum] = "f68ac28915a2221667cddb3e6c589303c3c6954c6c5af6fefaec7f9bdf72fdca"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "emoji"
RDEPENDS:${PN} = "python3-typing-extensions"
