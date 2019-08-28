$(document).ready(function(){

    $('figure').each(function(){
        var a = $(this);
        var img = a.find("img");
        var srcOff = img.attr('src');
        var srcOn = srcOff.replace('-off', '-on');
        var bg = srcOff.replace('-off', '-bg');

        $("<img>").attr('src', srcOn);
        $("<img>").attr('src', bg);

        a.on({
            'mouseenter focusin': function(){
                img.attr('src', srcOn);
                 $('.div_wrapper').css('background-image','url('+bg+')');
            },
            'mouseleave blurout': function () {
                img.attr('src', srcOff);
            }
        });
    });
});