SUMMARY = "Universal feed parser, handles RSS 0.9x, RSS 1.0, RSS 2.0, CDF, Atom 0.3, and Atom 1.0 feeds"
HOMEPAGE = "https://github.com/kurtmckee/feedparser"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62b06546e31ac3ab18cf54be0a1aa5ec"

SRC_URI[sha256sum] = "c9d0407b64c6f2a065d0ebb292c2b35c01050cc0dc33757461aaabdc4c4184d5"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-chardet \
    python3-compression \
    python3-core \
    python3-datetime \
    python3-email \
    python3-html \
    python3-netclient \
    python3-sgmllib3k \
    python3-xml \
"

PYPI_PACKAGE = "feedparser"
