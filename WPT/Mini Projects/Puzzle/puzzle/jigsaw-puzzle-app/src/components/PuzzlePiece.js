import React from 'react';
import '../pages/PuzzlePage.css';

const PuzzlePiece = ({ id, piece, onDropPiece }) => {
  const handleDragStart = (e) => {
    e.dataTransfer.setData('text/plain', id);
  };

  const handleDrop = (e) => {
    e.preventDefault();
    const fromId = parseInt(e.dataTransfer.getData('text/plain'));
    onDropPiece(fromId, id);
  };

  const handleDragOver = (e) => {
    e.preventDefault();
  };

  return (
    <div
      className="puzzle-piece"
      draggable
      onDragStart={handleDragStart}
      onDrop={handleDrop}
      onDragOver={handleDragOver}
      style={{
        width: `${piece.width}px`,
        height: `${piece.height}px`,
        backgroundImage: `url(${piece.image})`,
        backgroundSize: 'cover',
      }}
    >
      {/* Remove or comment out the piece-info */}
      {/* <div className="piece-info">
        <span className="grid-number">{gridIndex}</span>
        <span className="piece-name">Piece {id}</span>
      </div> */}
    </div>
  );
};

export default PuzzlePiece;
