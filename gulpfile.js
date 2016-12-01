var gulp = require('gulp');
var ugly = require('gulp-uglify');
var ts = require('gulp-typescript');
var merge = require('merge2');

var tSrc = 'src/**/*.ts';
var dest = 'release/';

gulp.task('ts2js',function(){
    var tsResult = gulp.src(tSrc)
    .pipe(ts({
        declaration:true,
        out:'index.m.js'
    }));

    return merge([
        tsResult.dts.pipe(gulp.dest(dest + 'def')),
        tsResult.js.pipe(ugly()),
        tsResult.js.pipe(gulp.dest(dest + 'js'))
    ])
})

gulp.task('watch',['ts2js'],function(){
    gulp.watch(tSrc,['ts2js'])
})