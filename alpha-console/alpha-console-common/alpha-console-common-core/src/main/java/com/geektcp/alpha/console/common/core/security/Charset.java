package com.geektcp.alpha.console.common.core.security;

/**
 *
 */
public enum Charset {

	/**
	 * ASCII（American Standard Code for Information Interchange，美国信息互换标准代码）<br/>
	 * 是基于罗马字母表的一套电脑编码系统，它主要用于显示现代英语和其他西欧语言<br/>
	 * 它是现今最通用的单字节编码系统，并等同于国际标准ISO 646
	 */
	ASCII("ascii"),
	/**
	 * 通常叫做Latin-1，和ASCII编码相似<br/>
	 * 属于单字节编码，最多能表示的字符范围是0-255，应用于英文系列
	 */
	ISO8859_1("iso8859-1"),
	/**
	 * GB2312又称为GB2312-80字符集，全称为<信息交换用汉字编码字符集·基本集>，由原中国国家标准总局发布，1981年5月1日实施，
	 * 是中国国家标准的简体中文字符集。它所收录的汉字已经覆盖99.75%的使用频率，基本满足了汉字的计算机处理需要。在中国大陆和新加坡获广泛使用
	 * <br/>
	 * GB2312收录简化汉字及一般符号、序号、数字、拉丁字母、日文假名、希腊字母、俄文字母、汉语拼音符号、汉语注音字母，共 7445
	 * 个图形字符。其中包括6763个汉字，其中一级汉字3755个，二级汉字3008个；包括拉丁字母、希腊字母、日文平假名及片假名字母、
	 * 俄语西里尔字母在内的682个全角字符。
	 */
	GB2312("gb2312"),
	/**
	 * GBK字符集是GB2312的扩展(K)<br/>
	 * GBK1.0收录了21886个符号，它分为汉字区和图形符号区，汉字区包括21003个字符。GBK字符集主要扩展了繁体中文字的支持
	 */
	GBK("gbk"),
	/**
	 * GB18030的全称是GB18030-2000<信息交换用汉字编码字符集基本集的扩充>，是我国政府于2000年3月17日发布的新的汉字编码国家标准
	 * ，2001年8月31日后在中国市场上发布的软件必须符合本标准<br/>
	 * GB 18030字符集标准的出台经过广泛参与和论证，来自国内外知名信息技术行业的公司，信息产业部和原国家质量技术监督局联合实施<br/>
	 * GB 18030字符集标准解决汉字、日文假名、朝鲜语和中国少数民族文字组成的大字符集计算机编码问题。该标准的字符总编码空间超过150万个编码位，
	 * 收录了27484个汉字，覆盖中文、日文、朝鲜语和中国少数民族文字。
	 * 满足中国大陆、香港、台湾、日本和韩国等东亚地区信息交换多文种、大字量、多用途、统一编码格式的要求
	 * 并且与UNICODE3.0版本兼容，填补UNICODE扩展字符字汇“统一汉字扩展A”的内容。并且与以前的国家字符编码标准（GB2312，
	 * GB13000.1）兼容
	 */
	GB18030("gb18030"),
	/**
	 * BIG5又称大五码或五大码<br/>
	 * 1984年由台湾财团法人信息工业策进会和五间软件公司宏碁 (Acer)、神通 (MiTAC)、佳佳、零壹 (Zero
	 * One)、大众(FIC)创立，故称大五码<br/>
	 * Big5码的产生，是因为当时台湾不同厂商各自推出不同的编码，如倚天码、IBM
	 * PS55、王安码等，彼此不能兼容；另一方面，台湾政府当时尚未推出官方的汉字编码，而中国大陆的GB2312编码亦未有收录繁体中文字<br/>
	 * Big5字符集共收录13,053个中文字，该字符集在中国台湾使用
	 */
	BIG5("big5"),
	/**
	 * 这是最统一的编码，可以用来表示所有语言的字符，而且是定长双字节（也有四字节的）编码，包括英文字母在内。所以可以说它是不兼容iso8859-1编码的
	 * ，也不兼容任何编码<br/>
	 * 不过，相对于iso8859-1编码来说，UNICODE编码只是在前面增加了一个0字节，比如字母a为"00 61"<br/>
	 * 需要说明的是，定长编码便于计算机处理（注意GB2312/GBK不是定长编码），而UNICODE又可以用来表示所有字符，
	 * 所以在很多软件内部是使用UNICODE编码来处理的，比如java
	 */
	UNICODE("unicode"),
	/**
	 * UTF-8是UNICODE的其中一个使用方式<br/>
	 * UTF-8便于不同的计算机之间使用网络传输不同语言和编码的文字，使得双字节的UNICODE能够在现存的处理单字节的系统上正确传输<br/>
	 * UTF-8使用可变长度字节来储存UNICODE字符，例如ASCII字母继续使用1字节储存，重音文字、希腊字母或西里尔字母等使用2字节来储存，
	 * 而常用的汉字就要使用3字节。辅助平面字符则使用4字节
	 */
	UTF8("utf-8"),
	/** UTF-16 使用一个或两个未分配的 16 位代码单元的序列对 UNICODE 代码点进行编码 */
	UTF16("utf-16"),
	/** UTF-32 即将每一个 UNICODE 代码点表示为相同值的 32 位整数 */
	UTF32("utf-32");

	public final String VALUE;

	private Charset(String VALUE) {
		this.VALUE = VALUE;
	}

}
