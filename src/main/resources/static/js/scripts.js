// ** Menu **/ 
((d)=>{
    const $btn_menu = d.getElementById('menu-btn'),
    $menu = d.getElementById('header-menu')
    $logo = d.getElementById('header-logo')
    $btn_menu.addEventListener("click",e=>{
        $menu.classList.toggle('is-active')
        $logo.classList.toggle('is-active')
        $btn_menu.classList.toggle('is-active')
        $btn_menu.firstElementChild.classList.toggle('d-none')
        $btn_menu.lastElementChild.classList.toggle('d-none')
    })
    d.addEventListener('click', e=>{
        if (!e.target.matches('.header-menu a')) {
            return false
        }
        $btn_menu.firstElementChild.classList.toggle('d-none')
        $btn_menu.lastElementChild.classList.toggle('d-none')
        $menu.classList.remove('is-active')
    })
})(document);
// ** Cursor **/
((d)=>{
    const $cursor = d.querySelector('.cursor');
    d.addEventListener('mousemove',e=>{
        $cursor.setAttribute('style','top:'+(e.pageY - 20)+'px; left: '+(e.pageX-20)+'px;')
    })
    d.addEventListener('click',e=>{
        $cursor.classList.add('expand')
        setTimeout(() => {
           $cursor.classList.remove('expand') 
        }, 500);
    })
})(document);
// ** PreLoader **/
((d)=>{
    $center = d.querySelector('.center')
    $center2 = d.querySelector('.center-2__container')
    $body = d.querySelector('body')
    console.log($center);
    console.log(window);
    window.addEventListener('load', e=>{
    setTimeout(() => {
        $center.style.opacity = "0"
        $center.style.visibility = "hidden"
        $center2.style.opacity = "0"
        $center2.style.visibility = "hidden"
        $body.classList.remove('hidden')
    }, 5000);
    
    })
})(document);
//** Background, Color And Fill **/
((d=>{
    const $sections = [ $home = d.getElementById('home'),
    $about = d.getElementById('about'),
    $products = d.getElementById('products'),
    $testimonials = d.getElementById('testimonials'),
    $contact = d.getElementById('contact') ],
    $headerLogo = d.querySelector('.header-logo'),
    $headerLink = d.querySelectorAll('.header-menu a'),
    $sectionTitle = d.querySelectorAll('.section-title'),
    $headerBtn = d.querySelector('.menu-btn svg')
    const cb = (entries)=>{
        entries.forEach(entry =>{{
            console.log("entry : ",entry);
            // console.log("entryTarget : ",entry.target);
            if(entry.isIntersecting){
                if(entry.target === $home){
                    $headerLogo.style.fill = "var(--secondary-color )"
                    $headerBtn.style.fill = "var(--secondary-color )"
                    $headerLink.forEach(el=>{
                        el.style.color = "var(--secondary-color)"
                    })
                    
                }
                if(entry.target === $about){
                    entry.target.style.background = "var(--third-color)"
                    $headerLogo.style.fill = "var(--gray-light-color )"
                    $headerBtn.style.fill = "var(--gray-light-color )"
                    $headerLink.forEach(el=>{
                        el.style.color = "var(--gray-light-color )"
                    })
                    $headerLink[0].classList.add('is-active')
                    d.querySelector('.about .section-title').classList.add('is-active')
                }
                if(entry.target === $products){
                    entry.target.style.background = "var(--fifth-color)"
                    $headerLogo.style.fill = "var(--secondary-color)"
                    $headerBtn.style.fill = "var(--secondary-color)"
                    $headerLink.forEach(el=>{
                        el.style.color = "var(--secondary-color)"
                    })
                    $headerLink[1].classList.add('is-active')
                    d.querySelector('.products .section-title').classList.add('is-active')
                }
                if(entry.target === $testimonials){
                    entry.target.style.background = "var(--secondary-color)"
                    $headerLogo.style.fill = "var(--fifth-color)"
                    $headerBtn.style.fill = "var(--fifth-color)"
                    $headerLink.forEach(el=>{
                        el.style.color = "var(--fifth-color)"
                    })
                    $headerLink[2].classList.add('is-active')
                    d.querySelector('.testimonials .section-title').classList.add('is-active')
                }
                if(entry.target === $contact){
                    entry.target.style.background = "var(--seventh-color)"
                    $headerLogo.style.fill = "var(--primary-color)"
                    $headerBtn.style.fill = "var(--primary-color)"
                    $headerLink.forEach(el=>{
                        el.style.color = "var(--primary-color)"
                    })
                    $headerLink[3].classList.add('is-active')
                    d.querySelector('.contact .section-title').classList.add('is-active')
                }
            }else{
                if(entry.target === $about){
                    d.querySelector('.about .section-title').classList.remove('is-active')
                    $headerLink[0].classList.remove('is-active')
                }
                if(entry.target === $products){
                    d.querySelector('.products .section-title').classList.remove('is-active')
                    $headerLink[1].classList.remove('is-active')
                }
                if(entry.target === $testimonials){
                    d.querySelector('.testimonials .section-title').classList.remove('is-active')
                    $headerLink[2].classList.remove('is-active')
                }
                if(entry.target === $contact){
                    d.querySelector('.contact .section-title').classList.remove('is-active')
                    $headerLink[3].classList.remove('is-active')
                }
            }
        }})
    }
    const observer = new IntersectionObserver(cb,{ 
        threshold : 0.2
    })

    $sections.forEach(el => observer.observe(el))
}))(document);
//** Font **/
((d=>{
    console.log(d.getElementById('about'));
    const $about = d.getElementById('about')
    const cb = (entries)=>{
            console.log("entryTarget : ",entries.target);
            entries.forEach(entry =>{{
                    console.log("entry : ",entry);
                    console.log("entryTarget : ",entry.target);
                    if(entry.isIntersecting){
                        d.querySelector('.about__text').classList.add('is-active')
                        console.log("hola");
                    }else{
                        d.querySelector('.about__text').classList.remove('is-active')
                    }
                }})
            }
    const observer = new IntersectionObserver(cb,{ 
        threshold : 0.2
    })

    observer.observe($about)
    
}))(document);
//** IMG **/
((d=>{
    console.log(d.getElementById('about'));
    const $about = d.getElementById('about')
    const cb = (entries)=>{
            console.log("entryTarget : ",entries.target);
            entries.forEach(entry =>{{
                    console.log("entry : ",entry);
                    console.log("entryTarget : ",entry.target);
                    if(entry.isIntersecting){
                        d.querySelector('.about__profile').classList.add('is-active')
                        console.log("hola");
                    }else{
                        d.querySelector('.about__profile').classList.remove('is-active')
                    }
                }})
            }
    const observer = new IntersectionObserver(cb,{ 
        threshold : 0.2
    })

    observer.observe($about)
    
}))(document);