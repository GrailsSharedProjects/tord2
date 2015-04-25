<g:if test="${pageData.sliderRevolution}">
<g:set var="rev" value="${pageData.sliderRevolution}"/>
    <div class="tzslider">
        <div id="rev_slider_2_1_wrapper" class="rev_slider_wrapper fullscreen-container">
            <div id="rev_slider_2_1" class="rev_slider fullscreenbanner">
                <ul>
                	<g:each in="${rev.sliders }" var="slider">
                		<g:if test="${slider.style == 1 }">
		                	<li data-transition="fade" data-slotamount="7" data-masterspeed="300"  data-fstransition="fade" data-fsmasterspeed="300" data-fsslotamount="7" data-saveperformance="off" >
		                        <img src="${assetPath(src: slider.bgImage.url)}"  alt="${slider.bgImage.alt }"  data-bgposition="center top" data-bgfit="100% 100%" data-bgrepeat="no-repeat">
		                        <div class="tp-caption small_light_white sft stt tp-resizeme  tz-title-small"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="-110"
		                             data-speed="900"
		                             data-start="500"
		                             data-easing="Quad.easeInOut"
		                             data-splitin="none"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300"
		                             data-endeasing="Quad.easeOut">${slider.row1 }
		                        </div>
		
		                        <div class="tp-caption large_bold_white sfr str tp-resizeme  tz-title-large"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="-40"
		                             data-speed="900"
		                             data-start="1000"
		                             data-easing="Quad.easeOut"
		                             data-splitin="none"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300"
		                             data-endeasing="Quad.easeOut">${slider.row2 }
		                        </div>
		
		                        <div class="tp-caption large_bold_white randomrotate randomrotateout tp-resizeme  title-slider-big"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="85"
		                             data-speed="900"
		                             data-start="1500"
		                             data-easing="Quad.easeOut"
		                             data-splitin="none"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="900"
		                             data-endeasing="Quad.easeOut">${slider.row3 }
		                        </div>
		
		                        <!-- LAYER NR. 4 -->
		                        <div class="tp-caption medium_light_white sfb stb tp-resizeme  tz-content-lager"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="190"
		                             data-speed="900"
		                             data-start="2000"
		                             data-easing="Quad.easeOut"
		                             data-splitin="none"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300"
		                             data-endeasing="Quad.easeOut">${slider.row4 }
		                        </div>
		                    </li>
                		</g:if>
                		<g:elseif test="${slider.style == 2 }">
		                	<!-- SLIDE  -->
		                    <li data-transition="fade" data-slotamount="7" data-masterspeed="300"  data-saveperformance="off" >
		                        <!-- MAIN IMAGE -->
		                        <img src="${assetPath(src: slider.bgImage.url)}"  alt="${slider.bgImage.alt }"  data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat">
		                        <!-- LAYERS -->
		
		                        <!-- LAYER NR. 1 -->
		                        <div class="tp-caption large_bold_white sft stt tp-resizeme  title-slider"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="-70"
		                             data-speed="900"
		                             data-start="500"
		                             data-easing="Quad.easeIn"
		                             data-splitin="none"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300"
		                             data-endeasing="Quad.easeIn">${slider.row1 }
		                        </div>
		
		                        <!-- LAYER NR. 2 -->
		                        <div class="tp-caption small_light_white sfl stl tp-resizeme  content-slider"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="30"
		                             data-speed="900"
		                             data-start="700"
		                             data-easing="Power4.easeOut"
		                             data-splitin="words"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300"
		                             data-endeasing="Cubic.easeIn">${slider.row2 }
		                        </div>
		
		                        <!-- LAYER NR. 3 -->
		                        <div class="tp-caption small_light_white sfb stb tp-resizeme"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="100"
		                             data-speed="900"
		                             data-start="500"
		                             data-easing="Quad.easeIn"
		                             data-splitin="none"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300"
		                             data-endeasing="Power4.easeInOut"><a  href="#" class="learn-more-styl2"><span>${slider.row3 }</span></a>
		                        </div>
		                    </li>
                		</g:elseif>
                		<g:elseif test="${slider.style == 3 }">
		                    <!-- SLIDE  -->
		                    <li data-transition="fade" data-slotamount="7" data-masterspeed="300"  data-saveperformance="off" >
		                        <!-- MAIN IMAGE -->
		                        <img src="${assetPath(src: slider.bgImage.url)}"  alt="${slider.bgImage.alt }"  data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat">
		                        <!-- LAYERS -->
		
		                        <!-- LAYER NR. 1 -->
		                        <div class="tp-caption small_light_white sft tp-resizeme  slider-attach"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="-100"
		                             data-speed="1100"
		                             data-start="500"
		                             data-easing="Power3.easeInOut"
		                             data-splitin="none"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300">${slider.row1 }
		                        </div>
		
		                        <!-- LAYER NR. 2 -->
		                        <div class="tp-caption large_bold_white sfb tp-resizeme  title-slider-blod"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="-40"
		                             data-speed="900"
		                             data-start="500"
		                             data-easing="Power0.easeOut"
		                             data-splitin="none"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300">${slider.row2 }
		                        </div>
		
		                        <!-- LAYER NR. 3 -->
		                        <div class="tp-caption skewfromright"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="10"
		                             data-speed="1000"
		                             data-start="500"
		                             data-easing="Power3.easeInOut"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300"><img src="${assetPath(src: 'demos/Line_slider.jpg')}" alt="line">
		                        </div>
		
		                        <!-- LAYER NR. 4 -->
		                        <div class="tp-caption small_light_white randomrotate tp-resizeme  slider-ds"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="60"
		                             data-speed="1100"
		                             data-start="500"
		                             data-easing="Power3.easeInOut"
		                             data-splitin="none"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300">${slider.row3 }
		                        </div>
		
		                        <!-- LAYER NR. 5 -->
		                        <div class="tp-caption black sfb tp-resizeme"
		                             data-x="center" data-hoffset="0"
		                             data-y="center" data-voffset="125"
		                             data-speed="1100"
		                             data-start="500"
		                             data-easing="Power3.easeInOut"
		                             data-splitin="none"
		                             data-splitout="none"
		                             data-elementdelay="0.1"
		                             data-endelementdelay="0.1"
		                             data-endspeed="300"><a class="slider-button2"  href="#"><span>${slider.row4 }</span></a>
		                        </div>
		                    </li>
                		</g:elseif>
                	</g:each>
                </ul>
            </div>
        </div>
    </div><!--end class tzslider-->
</g:if>