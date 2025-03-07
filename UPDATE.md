## UPDATE  
* V5.6
    * 修复一个bug，该bug导致某些类型的互动视频查询不全  
    * 添加多线程下载实现。该功能默认关闭，不建议开启。具体使用详见`app.config`注释
* V5.5
    * 修复一个bug，该bug导致某些类型的互动视频查询会陷入死循环  
    * 优化 [issue#34](https://github.com/nICEnnnnnnnLee/BilibiliDown/issues/34) 实现用户名密码自动登录  
    * 尝试一种新的button按钮样式，如不适应，可在配置文件中回退，设置如下：  
        `bilibili.button.style = default`  
    
* V5.4
    * 版本更新时，从后台下载改为列入下载面板下载，可以直观看到下载进度
    * 新增课程解析  
        * <https://www.bilibili.com/cheese/play/ep1808>  
        * <https://www.bilibili.com/cheese/play/ss117>
    * 修复 [issue#33](https://github.com/nICEnnnnnnnLee/BilibiliDown/issues/33) 
        * <https://www.bilibili.com/video/BV1bb411Y7HH>  
        * <https://www.bilibili.com/video/BV1De411s71p>  
* V5.3
    * 完善 继番剧4K[av56995872](https://www.bilibili.com/video/av56995872)后，支持UP主4K视频下载
        * 测试[BV1xV411C7UF 4K50帧](https://www.bilibili.com/video/BV1xV411C7UF)  
        * 测试[BV1fK4y1t7hj 4K120帧](https://www.bilibili.com/video/BV1fK4y1t7hj)  
* V5.2
    * 完善 当某ss下p数超过20时，不再为每个视频详细查询支持清晰度，减少网络请求(以[ss33378](https://www.bilibili.com/bangumi/play/ss33378)为例，集数过千。。。)  
    * 修复 [issue#31](https://github.com/nICEnnnnnnnLee/BilibiliDown/issues/31) 为了适应flv合并的ffmpeg命令调用，保存文件夹配置路径末尾转化为`/`  
    * 修复 [issue#31](https://github.com/nICEnnnnnnnLee/BilibiliDown/issues/31) 为了解决某些ffmpeg应对不了的flv合并情况，增加了该功能的java实现
* V5.1
    * 新增 为Windows用户增加了FFmpeg.exe下载功能(指向自编译的上传在Release assets的附件)，进一步小白化  
	* 完善 当某av下p数超过20时，不再为每个视频详细查询支持清晰度，减少网络请求(特别是某些教程，以BV1pt41127FZ为例，分p数约400~)  
	* 完善 打包脚本新增cd到文件所在目录操作，进一步防止误操作  
* V5.0
    * workflow发布测试，功能上无更新
    * 提供了`package.sh`和`package.bat`两个脚本，支持不依赖IDE的jar包打包生成(**内含删除操作，请注意工作目录务必正确！！！**)
* V4.9
    * 新增 [#27](https://github.com/nICEnnnnnnnLee/BilibiliDown/issues/27) 稍后再看的批量下载
    * 修复 [#28](https://github.com/nICEnnnnnnnLee/BilibiliDown/issues/28) up所有视频下载解析失效问题
* V4.8
    * 本地进行av和bv相互转换，减少网络请求  
* V4.7 
    * 修复v4.6引入的多p视频只显示第一个的bug  
* V4.6 
    * 新增BV Parser  
    * 修复Av/EP/SS/ML/UP主频道/UP主所有视频解析  
    * 因B站API修改，下载历史改用BV作为关键词，提供了低版本到高版本的历史记录转换功能  
    * 修复一处可能存在非法文件路径的bug  
    * 精力有限，**不再支持调整优先下载格式(默认mp4-DASH优先)**  
    * 精力有限，**不再支持调整查找集合的分页弹出(默认在一页显示)**  
    
* V4.5 
    * 修复：4K返回1080P+的问题，现已正常[av56995872](https://www.bilibili.com/video/av56995872)
    * 优化：账号登录后可获取收藏夹，不必再专门打开网页复制url了
    * 优化：批量下载的默认设置可以在`app.config`中配置
    * 优化：防止程序在运行时被重复打开。该功能配置默认关闭，`bilibili.lockCheck=true`可打开
    * 优化：增加过渡动画，加载完毕后再显示界面，防止卡顿体验。双击动画可迅速跳过。
    * 其它：下载控制、Httpheader整理、预览图片链接复制的一个bug
* V4.4 
    * 优化：收藏夹对应的listName去掉分页数，自定义下载名称更加合理
    * 修复：[issue#21](https://github.com/nICEnnnnnnnLee/BilibiliDown/issues/21) 当API返回的首选下载链接失效时，使用备用链接
    * 修复：[issue#21](https://github.com/nICEnnnnnnnLee/BilibiliDown/issues/21) 当av不存在音频时，增加处理逻辑
* V4.3  
	* 修复： 如果channel中存在已失效视频，那么该分页中已失效视频之后的视频信息将全部丢失
	* 新增： 相簿/画廊解析
        * `https://space.bilibili.com/[0-9]+/favlist?fid=albumfav` 相簿收藏夹√
        * [`https://h.bilibili.com/38894082`](https://h.bilibili.com/38894082)  单个相簿√  
        * [`https://space.bilibili.com/20358094/album`](https://space.bilibili.com/20358094/album) 某Up的所有相簿× `没有付出的爱是廉价的，你连收藏都不肯😳`
	* 优化：自定义文件名
        * 现在支持路径分隔符`/\`，e.g. 可将同质的某些视频放入同一个文件夹中
        * 增加可自定义字段 阿婆主名称/id。详见[app.config](https://github.com/nICEnnnnnnnLee/BilibiliDown/blob/master/src/resources/app.config)
* V4.2  
	* 修复bug： 关闭扫码图/关于框时，如果有活动的任务，会错误地弹出提示
	* 去除WebSocket依赖，实时弹幕相关可以参考[弹幕点歌姬](https://github.com/nICEnnnnnnnLee/DanmuMusicPlayer)
	* 部分util优化
* V4.1
    * 增加HTTP Deflate解析
    * 增加弹幕下载(提供下载链接 => 直接下载文件)
    * 修复收藏夹第一个为已失效视频，则无法解析的bug
    * 针对非Windows系统进行了部分适配工作
* V4.0
    * 新增互动视频下载(如av64006660)
* V3.9
    * 新增CC字幕下载，保存为`srt`格式(如果存在的话，比如av34218168)
* V3.8
    * 新增app独享视频下载(PC端不能看，以av2478750为例)
    * 增加4K清晰度(以av56995872为例)
    * 包扫描机制优化
    * INeedAV的Main入口做了部分优化
* V3.7
    *  [issue#10](https://github.com/nICEnnnnnnnLee/BilibiliDown/issues/10)新增`正在转码状态`,细化下载任务状态提示  
    * 增加ffmpeg环境判断与提示  
    * 修复菜单里的Repo重载刷新问题  
    * Tab结果页里面av各p标题名称分情况显示  
    * 退出时如有活动任务，将给出提示
* v3.6
    * 优化下载异常处理，失败后自动重新添加到下载队列(默认3次后停止,`bilibili.download.maxFailRetry = 3`)
    * 优化自定义名称
        * 目标是使通过`收藏夹` 和 `单独av`等不同方式得到的 `av标题` 和 `视频小标题` 均保持一致
        * 增加 `集合名称/拥有者` 字段，可通过条件来命名(也就是没有这个字段时不算数)
        * 更多请查看`[app.config](https://github.com/nICEnnnnnnnLee/BilibiliDown/blob/master/src/resources/app.config)`
    * 优化ToolTip提示，鼠标悬浮可显示内容过长时省略的内容
    * 增加菜单功能 - 配置/仓库文件改动后，可直接重新加载，而不必重启程序(某些设置必须重启的除外)
    * 增加功能 - 复制弹幕下载链接(实验)
    * ~~WebSocket接收实时弹幕~~然而并没有，鸡肋
* v3.5
    * 修复`bug` - 当实际清晰度低于预期下载清晰度时，如果下载过程中有停止再继续的行为，将导致重命名失败，且清晰度失真
    * 修复`bug` - `V3.4`因UI更新引入的批量下载优先清晰度始终为`1080P60`的问题
    * 主程序将菜单栏移到标题栏中
    * `扫码`和`关于`界面自定义标题栏，防止系统主题下不出现关闭按钮
    * `README`预览图压缩，节省流量
* v3.4
    * 增加功能 - 下载任务面板根据任务状态的不同，显示不同的背景色
    * 增加一键更新功能
    * 增加`关于`页面
    * UI优化 - 增加菜单栏
    * 其它微不足道的改动
* v3.3
    * 批量下载时，针对已下载弹出框提示太多的情况，做了优化
         *  增加弹出框提示开关，在配置文件里面设置后，可以不再提示
         *  弹出框增加关闭所有提示框按钮，点击可以关闭所有提示
         *  增加最大弹出框数量限制，超出后不再弹出提示（默认为5）
* v3.2
    * 修复下载路径不存在时，程序关闭不了的问题
    * 双击视频某p Title可获取作品信息(适用于批量打开的情况)
    * 长按视频某p Title可更新预览图
    * 点击预览图可获取图片链接
    * `parser`遍历选择时增加break，减少不必要的循环  
    * 解决文件路径中含多个空格问题
* v3.1 beta
    * 程序标题显示版本号
    * 代码重构，整个框架有较大改动  `beta`
    * 增加批量查询的呈现方式，可以全部放在一页里面，也可以打开Tab页(将所有视频设为默认呈现，没有为所有视频再详细查询支持清晰度  `beta`
    * 增加下载完成记录保存功能 `beta`
    * 修复临时文件误删除的问题 
    * 修复一个cookie相关的问题 - cookie在验证无效后，继续使用会导致后续请求被拒，应当置空
    * 纠正下载文件命名中的清晰度值  
    * 纠正输入框直接右键粘贴 和 PlaceHolder的逻辑处理问题  
    * 纠正解析失败后`Enter`键的处理，输入框`Enter`键的监听事件`KeyReleased` -> `KeyPressed` 
    * 纠正下载ss剧集时属于av第几p的问题 
    * 优化查询分页API，不再有20页限制    
    * 优化清晰度字典，使用`Enum`
    * 优化从下载任务栏打开文件夹功能，打开时选中文件(如果文件存在)
    * 优化UP主个人全部主页匹配规则
    * 优化重命名功能，可以根据需要配置下载文件名(请注意,使用不同解析方式得到的下载文件名可能不同,例如avXXX和打开收藏夹mlXXX后对应的avXXX不会相同,后者会包括更多信息)
    * 优化其它逻辑
    * 去掉等待动图
    
* v3.0
    * 修复下载面板任务过多时，下拉到底不能列出所有任务的问题  
    * 批量下载优先策略增加```1080P60```、```720P60```选项  
    * 下载面板增加批量下载控制选项 
    * 查找输入框增加`Enter`快捷键响应  
    * 程序关闭，以及每次ffmpeg转换完毕，增加删除所有临时文件判断
    * 新增跟随系统主题，与swing默认有所区别(测试中)    
    * 其它UI优化  
* v2.9
    * 新增功能 - 批量下载av的所有视频  
    * 新增功能 - 批量下载所有打开的标签页的视频  
    * 其它UI改动  
* v2.8
    * 主页输入框添加右键菜单  
    * 更换收藏夹信息获取api，并增加```mlXXX```形式的解析   
    ```https://api.bilibili.com/medialist/gateway/base/spaceDetail?media_id=XXX&pn=%d&ps=%d&keyword=&order=mtime&type=0&tid=0&jsonp=jsonp```  
    改为  
    ```https://api.bilibili.com/medialist/gateway/base/detail?media_id=XXX&pn=%d&ps=%d```  
    (前者需要personID参数构造header，否则没有权限)
    * 分页信息查询的最大个数可以在```app.config```中灵活设置
* v2.7
    * Tab页标题过长时, 省略部分内容, 以...代替  
    * 增加SOCKS/HTTP/HTTPS代理支持   
    * release 压缩包去除好压    
* v2.6  
    * 解决部分视频下载不完整问题 - 发现电影是分段播的，原来的方式只能下载大概前5~6分钟，例如<https://www.bilibili.com/bangumi/play/ss10007>
    * 因为不怎么使用登录功能(一次登录cookies可以用很久)，以前未发现并处理因为网络原因造成的异常，现已解决
* v2.5  
    * 增加收藏夹的连接解析，例如<https://space.bilibili.com/3156365/favlist?fid=75463865>(url请务必包含fid参数)
    * 增加UP主个人页面的链接解析，例如<https://space.bilibili.com/5276/video> 
    * 增加UP主个人页面特定频道的链接解析，例如<https://space.bilibili.com/378034/channel/detail?cid=189>     
    * 修复某些链接的异常解析，例如<https://www.bilibili.com/video/av41515020?from=search&seid=11021327663579949519>
    * 增加卸载脚本```unistall.bat```(其实就是删除文件夹。。。)
    * 当前个人页面获取信息顺序为最新发布，且固定为每页5个(官网每页30个)，以防止跳出的Tab页面过多。想要获取请在后面加上p=[pageNumber]。
    e.g. 想要下载UP主```Hivane```最新发布的第31~35个视频(需确保后面没有空格)    
    ```https://space.bilibili.com/17154307/video?tid=0&page=2&keyword=&order=pubdate p=7```
* v2.4  
    * 增加官方番剧URL集合的链接解析，例如<https://www.bilibili.com/bangumi/play/ss25739> 
    * 增加官方番剧URL集合的链接解析，例如<https://www.bilibili.com/bangumi/media/md134912>     
    * (UI)优化最大同时下载数的显示
    * (UI)修复并优化部分UI显示
* v2.3 
    * (UI)增加下载速度显示   
    * (UI)新增vbs脚本，可以创建桌面快捷方式  
    * (UI)配置文件统一移入config文件夹中
    * 当选择为MP4而目标源仅存在FLV时，优化为自动切换FLV  
    * 修复一个bug，该bug使得在调用ffmpeg转码时，有概率会失败卡住  
    * 增加官方番剧URL(单集)的链接解析，例如<https://www.bilibili.com/bangumi/play/ep250435>  
    * 增加下载番剧的功能(以前一直测试的UP主上传的视频，突然发现追番的话似乎有点不同，于是增加了这个功能)       
    * PS： ep号转av号是直接从HTML里面爬出来的，不够优雅，暂时还没提取出提供api接口...
* v2.2 
    * 增加了HTML5播放源的下载方式,支持FLV/MP4两种格式 
    * (UI)下载面板优化为不允许存在相同的视频下载任务(不分辨清晰度)
    * (UI)在下载目录下增加了重命名```rename.bat```，默认格式为```avId-qn-p.(flv|mp4)```，可以使用该批处理批量改标题为```视频标题-qn-p.(flv|mp4)```(重命名功能暂只支持Windows)
    * (UI)增加了下载格式配置(flv 取Flash播放源, mp4 取HTML5播放源)
    * (UI)增加了下载路径配置
* v2.1 
    * 增加了断点续传的下载功能, 如果发现上次未下载完成的```.part```文件,会在上次的基础上继续进行下载;
    * (UI)新增暂停/下载异常后继续下载功能, 与断点续传功能相匹配;
    * (UI)在作品详情页面点击文字可以复制信息;
    * 考虑过把一个视频分成很多Fragment多线程下载的, 但这样似乎对服务器不是很好, 并且可以预见会有很多bug(这点最重要??), 再加上本身已经能够同时下载多个不同的av, 故而并没有继续;
    * 考虑过使用HTML5的播放源, ```.m3u8```的直接合并就行, 但像这种```.m4s```,木有经验额??. 如何解析报头的**SegmentBase**, 如何合并音视频, 目前正在潜水学习中... 关键是没有多媒体处理经验,不会ffmpeg
    
* v2.0 
    * 修复一个bug,该bug导致部分无效cookies验证抛出异常,而不是返回false;
    * (UI)修复一个bug,该bug使得扫码登录后未能及时更新用户头像等信息;
    * (UI)增加二维码扫码时限性,一分钟后自动销毁;
    * (UI)增加登录框点击动态效果,让人明白你点了它;
    * 下载flv名称由 ```avId-p.flv``` 改为```avId-qn-p.flv```,增加清晰度标识
    * (UI)优化了.bat脚本,```run-UI.bat```运行后命令窗口退出,```run-UI-debug.bat```运行后命令窗口留存,并且可查看输出信息