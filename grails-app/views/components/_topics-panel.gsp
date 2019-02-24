<div class="container mb-4 mt-4" id="topics-panel" style="width:600px">
    <div class="mt-1 mb-3">
        <a href="/topic/add">
            <button type="button" class="btn btn-secondary">Add topic</button>
        </a>
    </div>
    <ul class="list-group" data-bind="foreach: topics">
        <a data-bind="attr: { href: '/topic/' + id}" class="mb-1">
            <li class="list-group-item list-group-item-dark" aria-disabled="true" data-bind="text: title"></li>
        </a>
    </ul>
</div>

<script>
    var topicsPanelViewModel = {
        topics: ko.observableArray()
    };

    ko.applyBindings(topicsPanelViewModel, document.getElementById('topics-panel'));

    $(document).ready(function () {
        $.ajax({
            url: "/topic/",
            dataType: 'json',
            cache: false,
            timeout: 60000,
            success: function (result) {
                topics = ko.observableArray(result);
                result.map(function(topic) {
                    topicsPanelViewModel.topics.push(topic);
                })
            },
            error: function (xhr, ajaxOptions, thrownError) {
                console.log(thrownError);
            }
        });
    });
</script>
