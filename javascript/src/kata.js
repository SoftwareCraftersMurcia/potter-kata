const calculatePrice = (basket = []) => {   
    const basketSize = basket.length;
    const differentBooks = (new Set(basket)).size;
    if(differentBooks === 2) return (basketSize * 8) * 0.95;
    return basketSize * 8;
};

module.exports = {calculatePrice};
