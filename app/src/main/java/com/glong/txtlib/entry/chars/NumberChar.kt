package com.glong.txtlib.entry.chars

/**
 * 数字字符
 * @author guolong
 * @since 2019/9/27
 */
class NumberChar(c: Char) : TxtChar(c) {
    override var paddingStart: Float = PADDING / 2
    override var paddingEnd: Float = PADDING / 2

    companion object {
        var PADDING = 0f
    }
}