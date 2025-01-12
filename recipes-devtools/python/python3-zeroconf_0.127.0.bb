SUMMARY = "A least recently used (LRU) cache implementation"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/zeroconf/"

LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=9fe712b1bc27c5c4e9ecd7f31d208900"

SRC_URI[sha256sum] = "1ec001989666be7f76630d6bb8b07fb3928d655fa79a1484674a776778c9a1b3"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-ifaddr"
