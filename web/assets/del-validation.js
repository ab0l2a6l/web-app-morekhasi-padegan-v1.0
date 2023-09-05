function deleteValidation(){
    temp = 1;

    if(document.getElementById('del-first-name').value.length == 0){
        alert('first name ra por konid');
        temp = 0;
        }

    if(document.getElementById('del-last-name').value.length == 0){
            alert('last name ra por konid');
            temp = 0;
        }

    if(document.getElementById('del-id').value.length == 0){
            alert('id ra por konid');
            temp = 0;
        }

    if(document.getElementById('del-tedad-morekhasi').value.length == 0){
            alert('tedad morekhasi ra por konid');
            temp = 0;
        }

    if(temp == 1){
        document.getElementById('del-sub').submit();
    }
}