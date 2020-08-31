/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_display_file.c                                  :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: zmarth <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/24 20:24:03 by zmarth            #+#    #+#             */
/*   Updated: 2020/08/24 20:37:41 by zmarth           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <unistd.h>
#include <fcntl.h>

void	display(char *filename)
{
	int 	file;
	char 	c;

	file = open(filename, O_RDONLY);
	if (file < 0)
		return;
	while(read(file, &c, 1))
	{
	write(1, &c, 1);
	close(file);
	}
}

int main(int argc, char *argv[])
{
	if (argc == 1)
		write(2, "File name missing.\n", 19);
	else if (argc > 2)
		write(2, "Too many argements.\n", 20);
	else
		display(argv[1]);
	return (0);
}
