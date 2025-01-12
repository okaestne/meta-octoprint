SUMMARY = "Rate limiting utilities"
HOMEPAGE = "https://limits.readthedocs.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2455d5e574bc0fc489411ca45766ac78"
SRC_URI[sha256sum] = "cad16a9b3cf3924e27da48e78bdab33ef312ecb7194fdb50e509cc8111c8d0bb"

inherit pypi setuptools3

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "all allpython-version-smaller-3-dot-11 allpython-version-bigger--equals-3-dot-11andpython-version-smaller-3-dot-13-dot-0 async-etcd async-memcachedpython-version-smaller-3-dot-11 async-memcachedpython-version-bigger--equals-3-dot-11andpython-version-smaller-3-dot-13-dot-0 async-mongodb async-redis etcd memcached mongodb redis rediscluster"
PACKAGECONFIG[all] = ",,,python3-aetcd python3-coredis python3-etcd3 python3-motor python3-pymemcache python3-pymongo python3-redis! python3-redis!"
PACKAGECONFIG[allpython-version-smaller-3-dot-11] = ",,,python3-emcache"
PACKAGECONFIG[allpython-version-bigger--equals-3-dot-11andpython-version-smaller-3-dot-13-dot-0] = ",,,python3-emcache"
PACKAGECONFIG[async-etcd] = ",,,python3-aetcd"
PACKAGECONFIG[async-memcachedpython-version-smaller-3-dot-11] = ",,,python3-emcache"
PACKAGECONFIG[async-memcachedpython-version-bigger--equals-3-dot-11andpython-version-smaller-3-dot-13-dot-0] = ",,,python3-emcache"
PACKAGECONFIG[async-mongodb] = ",,,python3-motor"
PACKAGECONFIG[async-redis] = ",,,python3-coredis"
PACKAGECONFIG[etcd] = ",,,python3-etcd3"
PACKAGECONFIG[memcached] = ",,,python3-pymemcache"
PACKAGECONFIG[mongodb] = ",,,python3-pymongo"
PACKAGECONFIG[redis] = ",,,python3-redis!"
PACKAGECONFIG[rediscluster] = ",,,python3-redis!"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += " \
    python3-asyncio \
    python3-core \
    python3-datetime \
    python3-deprecated \
    python3-json \
    python3-packaging \
    python3-setuptools \
    python3-typing-extensions \
"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    coredis.commands
#    coredis.commands.script
#    cx_Freeze.dist
#    deprecated.sphinx
#    distutils.command.build_ext
#    distutils.command.build_py
#    distutils.command.sdist
#    distutils.core
#    py2exe.distutils_buildexe
#    redis
#    redis.sentinel

PYPI_PACKAGE = "limits"
