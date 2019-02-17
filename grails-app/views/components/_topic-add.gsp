<div class="container m-4 mx-auto" style="width:500px;background-color:#332222;padding:20px;border-radius:5px">
    <form action="/topic/add" method="post">
        <h2 class="text-center mb-3">Add topic</h2>
        <div class="form-group form-inline">
            <label class="col-3">Name</label>
            <input type="text" class="form-control col-9" placeholder="Topic title" name="title">
         </div>
        <div class="form-group">
            <label class="col-3">Content</label>
            <textarea type="text" class="form-control col-12" placeholder="Topic content" name="content"></textarea>
        </div>
        <div class="col text-right">
          <button type="submit" class=" btn btn-dark">Submit</button>
        </div>
    </form>
</div>

