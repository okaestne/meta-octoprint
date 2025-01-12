SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies."
HOMEPAGE = "https://github.com/h2non/filetype.py"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cc0e8af5f14a75ce53b7b9db0f4bd91e"

SRC_URI[sha256sum] = "66b56cd6474bf41d8c54660347d37afcc3f7d1970648de365c102ef77548aadb"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-core"

PYPI_PACKAGE = "filetype"
