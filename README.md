# 黑马苍穹外卖项目 sky-take-out
(一)要注意，day04和day09是个人作业，没有对应视频但资料里有对应代码，一定记得做，因为后面有些章节可能会用到一些作业里的方法
(二)微信支付功能个人没有资格申请，所以我直接跳过了相关功能，但要记得调用paySuccess方法所以管理端相关订单管理功能我也是直接跳过了相关功能，重在逻辑
(三)值得一提的是，这是通过nginx代理前后端分离的项目，我在项目初始环境搭建时改变了相关的端口号
所以导致后面的webSocket连接出了问题，我的解决办法是在前端代码里（app.d0aa4eb3.js）修改相关代码
 key: "webSocket",
                    value: function () {
                        var e = this,
                            t = Math.random().toString(36).substr(2),
                            n = "ws://localhost:8084/ws/" + t;
                        console.log(n, "socketUrl"), "undefined" == typeof WebSocket ? e.$notify({
                            title: "提示",
                            message: "当前浏览器无法接收实时报警信息，请使用谷歌浏览器！",
                            type: "warning",
                            duration: 0
                        }
在vscode里全局搜索websocket就可以找到
(四)花了一周多一点时间看完敲完，确实感觉收获良多，java学习还是任重道远，诸君共勉！！！
