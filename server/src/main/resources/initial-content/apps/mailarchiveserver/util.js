function toHtmlString(str) {
	var newstr = str.replace(/\ufffd/g, "").replace(/\&/g, "&amp;").replace(/\</g, "&lt;").replace(/\>/g, "&gt;").replace(/\"/g, "&quot;");
	return newstr;
}
