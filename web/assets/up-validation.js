function upValidation(){
    temp = 1;
    if(document.getElementById('up-first-name').value.length === 0) {
        temp =0;
        alert('first name ra por konid');
    }

    if(document.getElementById('up-last-name').value.length === 0) {
        temp =0;
        alert('last name ra por konid');
    }

    if(document.getElementById('up-id').value.length === 0) {
        temp =0;
        alert('id ra por konid');
    }

    if(document.getElementById('up-tedad-morekhasi').value.length === 0) {
        temp =0;
        alert('tedad morekhasi ra por konid');
    }

    if(document.getElementById('up-morekhasi-darkhasti').value.length === 0) {
        temp =0;
        alert('morekhasi darkhasti ra por konid');
    }

    if(temp == 1){
        document.getElementById('up-sub').submit();
    }
}