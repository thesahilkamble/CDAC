import React from 'react';
import { useDrag, useDrop } from 'react-dnd';

const PuzzlePiece = ({ id, piece, onDropPiece }) => {
  const [{ isDragging }, drag] = useDrag({
    type: 'PIECE',
    item: { id },
    collect: (monitor) => ({
      isDragging: !!monitor.isDragging(),
    }),
  });

  const [, drop] = useDrop({
    accept: 'PIECE',
    drop: (item) => {
      if (item.id !== id) {
        onDropPiece(item.id, id);
      }
    },
  });

  return (
    <div
      ref={(node) => drag(drop(node))}
      style={{
        backgroundImage: `url(${piece.image})`,
        width: `${piece.width}px`,
        height: `${piece.height}px`,
        opacity: isDragging ? 0.5 : 1,
        border: '1px solid #ddd',
        boxSizing: 'border-box',
        cursor: 'move',
      }}
    />
  );
};

export default PuzzlePiece;
