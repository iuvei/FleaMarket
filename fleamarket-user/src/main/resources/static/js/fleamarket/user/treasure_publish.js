/**
 * Created by jackiegao on 2018/4/23.
 */
$(function () {
    var $picture = $('.wizard-card .picture input[type="file"]');
    $("#picture-select").click(function () {
        $picture.click();
    })
    $picture.hover(function () {
        $("#wizardPicturePreview").css("border-color","#4caf50")
    },function () {
        $("#wizardPicturePreview").css("border-color","#ccc")
    });

    contentVue = new Vue({
        el: '#content',
        data: {
            title: '贼船（海盗船）K70 99成新RGB银轴黑色',
            description: 'Rapidfire幻彩背光机械游戏键盘 黑色 银轴 绝地求生吃鸡键盘。某东旗舰店17年年底购买，发票齐全。RGB黑色银轴，实测无臭轴油轴。本交易支持自提、当面、邮寄',
            category: '1',
            newDegree: '98',
            // tradingMethod: [],
            price: '0',
            fare: '0',
            pickUp: false,
            faceGay: false,
            postMan: true
        },
        // methods: {
        //     contains: function (name) {
        //         return this.tradingMethod.indexOf(name) >= 0;
        //     }
        // }
    });
    // var titleVue = new Vue({
    //     el: '#address'
    // })
});