$(function () {
    // 初始化Web Uploader
    var uploader = WebUploader.create({
        // 选完文件后，是否自动上传。
        auto: true,
        // swf文件路径
        swf: '/webuploader/Uploader.swf',
        // 文件接收服务端。
        server: '/uploadImg',
        // 选择文件的按钮。可选。
        // 内部根据当前运行是创建，可能是input元素，也可能是flash.
        pick: '#filePicker',
        fileNumLimit: 1,
        // 只允许选择图片文件。
        accept: {
            title: 'Images',
            extensions: 'gif,jpg,jpeg,bmp,png',
            mimeTypes: 'image/jpg,image/jpeg,image/png'//修改/*可以提高相应
        }
    });

    // 当有文件添加进来的时候
    uploader.on('fileQueued', function (file) {

        var $li = $(
            '<span id="' + file.id + '" class="file-item">' +
            '<img width="315" height="148">' +
            '</span>'
            ),
            $img = $li.find('img');
        // $list为容器jQuery实例
        $("#fileList").append($li);
        // 创建缩略图
        // 如果为非图片文件，可以不用调用此方法。
        // thumbnailWidth x thumbnailHeight 为 100 x 100
        uploader.makeThumb(file, function (error, src) {
            if (error) {
                $img.replaceWith('<span>不能预览</span>');
                return;
            }
            $img.attr('src', src);
        }, 315, 148);
    });

// 文件上传成功，给item添加成功class, 用样式标记上传成功。
    uploader.on('uploadSuccess', function (file, response) {
        var url = response.url;
        $('#' + file.id).addClass('upload-state-done');
        $("#cover").val(url);
    });


// 文件上传失败，显示上传出错。
    uploader.on('uploadError', function (file) {
        var $li = $('#' + file.id),
            $error = $li.find('div.error');

        // 避免重复创建
        if (!$error.length) {
            $error = $('<div class="error"></div>').appendTo($li);
        }

        $error.text('上传失败');
    });

    $("#filePicker").click(function () {
        //编辑时将原有图片删除
        $("#fileList span").remove();
    });
});