package rpek.baby.model

/**
 * Created by r.pek on 07.10.2017.
 */
class Baby{
    var name:String?=null
    var desc:String?=null
    var image:Int?=null

    constructor(name:String, desc:String, image:Int){
        this.name=name
        this.desc=desc
        this.image=image
    }
}