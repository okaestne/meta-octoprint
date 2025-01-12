SUMMARY = "Rate limiting for flask applications"
HOMEPAGE = "https://flask-limiter.readthedocs.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2455d5e574bc0fc489411ca45766ac78"

SRC_URI[sha256sum] = "b110049cf7f7b1c5e24f01c3c76e34357303ee64d27a9b32e88e84ea8a0fc97b"

inherit pypi setuptools3

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "memcached mongodb redis"
PACKAGECONFIG[memcached] = ",,,python3-limits[memcached]"
PACKAGECONFIG[mongodb] = ",,,python3-limits[mongodb]"
PACKAGECONFIG[redis] = ",,,python3-limits[redis]"

RDEPENDS:${PN} += " \
    python3-click \
    python3-core \
    python3-datetime \
    python3-flask \
    python3-json \
    python3-limits \
    python3-logging \
    python3-ordered-set \
    python3-rich \
    python3-setuptools \
    python3-typing-extensions \
    python3-werkzeug \
"

PYPI_PACKAGE = "flask_limiter"
