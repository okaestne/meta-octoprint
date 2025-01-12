SUMMARY = "A modern and easy to use streamable zip file generator"
HOMEPAGE = "https://github.com/pR0Ps/zipstream-ng"

LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI[sha256sum] = "b7129d2c15d26934b3e1cb22256593b6bdbd03c553c26f4199a5bf05110642bc"

inherit pypi setuptools3

# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "tests"
PACKAGECONFIG[tests] = ",,,python3-pytest python3-pytest-cov"

RDEPENDS:${PN} += "python3-compression python3-core python3-datetime python3-html python3-logging python3-netclient"

PYPI_PACKAGE = "zipstream_ng"
