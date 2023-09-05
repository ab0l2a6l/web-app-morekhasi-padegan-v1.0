function saveValidation(){
    temp = 1;

    if(document.getElementById('save-first-name').value.length == 0){
        alert('first name ra por konid');
        temp = 0;
        }

    if(document.getElementById('save-last-name').value.length == 0){
            alert('last name ra por konid');
            temp = 0;
        }

    if(document.getElementById('save-id').value.length == 0){
            alert('id ra por konid');
            temp = 0;
        }

    if(document.getElementById('save-tedad-morekhasi').value.length == 0){
            alert('tedad morekhasi ra por konid');
            temp = 0;
        }

    if(temp == 1){
        document.getElementById('save-sub').submit();
    }
}