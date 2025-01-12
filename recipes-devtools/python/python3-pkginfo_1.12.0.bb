SUMMARY = "Query metadata from sdists / bdists / installed packages."
HOMEPAGE = "https://code.launchpad.net/~tseaver/pkginfo/trunk"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

SRC_URI[sha256sum] = "8ad91a0445a036782b9366ef8b8c2c50291f83a553478ba8580c73d3215700cf"

inherit pypi setuptools3

# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "testing"
PACKAGECONFIG[testing] = ",,,python3-pytest python3-pytest-cov python3-wheel"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-compression python3-core python3-email python3-io python3-json python3-misc python3-packaging python3-shell python3-unittest"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    namespaced.manky
#    namespaced.wonky

PYPI_PACKAGE = "pkginfo"
