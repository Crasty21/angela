// JavaScript
document.addEventListener('DOMContentLoaded', () => {
    const message = document.getElementById('message');
    const audioOverlay = document.getElementById('audio-overlay');
    const audio = document.getElementById('audio');
    const heartsContainer = document.getElementById('hearts');
    
    // Function to generate falling hearts
    function generateHearts(num) {
        for (let i = 0; i < num; i++) {
            const heart = document.createElement('div');
            heart.className = 'heart';
            heart.style.left = Math.random() * 100 + '%'; // Random horizontal position
            heart.style.animationDuration = (Math.random() * 2 + 1) + 's'; // Random duration
            heart.style.animationDelay = (Math.random() * 2) + 's'; // Random delay
            heartsContainer.appendChild(heart);
        }
    }

    // Generate 10,000 hearts
    generateHearts(10000);

    message.addEventListener('animationend', () => {
        audioOverlay.style.display = 'flex';
        audio.play();
    });
});
